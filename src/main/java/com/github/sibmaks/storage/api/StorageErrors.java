package com.github.sibmaks.storage.api;

import com.github.sibmaks.error_service.exception.ServiceError;
import lombok.AllArgsConstructor;

/**
 * @author sibmaks
 * @since 2023-04-11
 */
@AllArgsConstructor
public enum StorageErrors implements ServiceError {
    NOT_FOUND,
    BUCKET_NOT_EXISTS,
    BUCKET_READONLY,
    UNEXPECTED_ERROR;


    @Override
    public String getErrorCode() {
        return name();
    }

    @Override
    public String getSystemCode() {
        return "STORAGE";
    }
}
