package com.suninfotech.admin.configuration;

import com.rapidsoft.admin.entity.AuditLog;
import com.rapidsoft.admin.repository.AuditLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ContentTraceEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(ContentTraceEventHandler.class);
    private final ApplicationEventPublisher publisher;
    private final AuditLogRepository userActivityService;

    public ContentTraceEventHandler(ApplicationEventPublisher publisher, AuditLogRepository userActivityService) {
        this.publisher = publisher;
        this.userActivityService = userActivityService;
    }

    @Async
    @EventListener
    public void contentTraceEventListener(AuditLog auditLog) {
        if (auditLog != null) {
            logger.info("Received user activity and saving to the database: {}", auditLog.toString());
            userActivityService.save(auditLog);
        }
    }

    void publishContentTrace(AuditLog auditLog) {
        logger.debug("Publishing content trace event");
        publisher.publishEvent(auditLog);
    }

}