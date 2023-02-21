package com.suninfotech.admin.configuration;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

import com.rapidsoft.admin.entity.AuditLog;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class CustomHttpTraceFilter extends OncePerRequestFilter {

    private final ContentTraceEventHandler contentTraceEventHandler;
    private AuditLog auditLog;

    public CustomHttpTraceFilter(ContentTraceEventHandler contentTraceEventHandler) {
        this.contentTraceEventHandler = contentTraceEventHandler;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        auditLog = new AuditLog();
        auditLog.setRequestedAt(new Date());

        try {
            filterChain.doFilter(requestWrapper, responseWrapper);
        } finally {
            afterRequest(requestWrapper, responseWrapper);
        }

    }

    private void afterRequest(ContentCachingRequestWrapper requestWrapper, ContentCachingResponseWrapper responseWrapper) throws IOException {

        /*
         *  From Request Headers
         */
        String method = requestWrapper.getMethod();
        boolean isGetMethod = method.equals("GET");
        // At the moment get requests are not being tracked
        if (isGetMethod) {
            responseWrapper.copyBodyToResponse();
            //return;
        }
        String jsonString = getResponsePayload(responseWrapper);
        auditLog.setEndPoint(requestWrapper.getRequestURI());
        auditLog.setIpAddress(requestWrapper.getRemoteAddr());
        auditLog.setActive(true);
        auditLog.setRequestBody(getRequestPayload(requestWrapper));
        auditLog.setRequestedBy(null);
        auditLog.setResponseBody(jsonString);
        responseWrapper.copyBodyToResponse();
        /*
         * Important to copy the original response body, because it is removed.
         */
        // publish event
        contentTraceEventHandler.publishContentTrace(auditLog);
    }

    private String getRequestPayload(HttpServletRequest request) {
        ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                int length = buf.length;
                try {
                    return new String(buf, 0, length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException ex) {
                    return "[unknown]";
                }
            }
        }
        return "";
    }

    private String getResponsePayload(ContentCachingResponseWrapper wrappedResponse) {
        ContentCachingResponseWrapper wrapper = WebUtils.getNativeResponse(wrappedResponse, ContentCachingResponseWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                String payload;
                try {
                    payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException e) {
                    payload = "[unknown]";
                }
                return payload;
            }
        }
        return null;
    }

}