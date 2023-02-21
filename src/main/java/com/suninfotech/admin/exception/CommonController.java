package com.suninfotech.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CommonController {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody
    Response<?> handleResourceNotFound(final ResourceNotFoundException exception,
                                       final HttpServletRequest request) {

        Response<?> error = new Response<>();
        error.setResponseCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    Response<?> handleException(final Exception exception,
                                final HttpServletRequest request) {

        Response<?> error = new Response<>();
        error.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public @ResponseBody
    Response<?> handleUnauthorizedException(final Exception exception,
                                            final HttpServletRequest request) {

        Response<?> error = new Response<>();
        error.setResponseCode(HttpStatus.UNAUTHORIZED.value());
        error.setMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(UnexpectedRollbackException.class)
    @ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
    public @ResponseBody
    Response<?> handleUUnexpectedRollbackExceptionException(final Exception exception,
                                                            final HttpServletRequest request) {

        Response<?> error = new Response<>();
        error.setResponseCode(HttpStatus.UNPROCESSABLE_ENTITY.value());
        error.setMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(ResourceExistAlready.class)
    @ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
    public @ResponseBody
    Response<?> alreadyReportedExceptionException(final Exception exception,
                                                  final HttpServletRequest request) {

        Response<?> error = new Response<>();
        error.setResponseCode(HttpStatus.ALREADY_REPORTED.value());
        error.setMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }
}
