package com.suninfotech.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.ALREADY_REPORTED)
public class ResourceExistAlready extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceExistAlready(String message) {
        super(message);
    }
}
