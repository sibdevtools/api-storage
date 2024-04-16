package com.github.simple_mocks.storage.api;

import com.github.simple_mocks.error_service.exception.ServiceError;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@AllArgsConstructor
public enum StorageErrors implements ServiceError {
    /**
     * Content not found
     */
    NOT_FOUND,
    /**
     * Bucket doesn't exist
     */
    BUCKET_NOT_EXISTS,
    /**
     * Bucket in read-only mode
     */
    BUCKET_READONLY,
    /**
     * Unexpected error happened
     */
    UNEXPECTED_ERROR;

    @Nonnull
    @Override
    public String getErrorCode() {
        return name();
    }

    @Nonnull
    @Override
    public String getSystemCode() {
        return "STORAGE";
    }
}
