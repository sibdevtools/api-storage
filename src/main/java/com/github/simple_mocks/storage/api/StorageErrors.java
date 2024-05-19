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
     * Bucket not found
     */
    BUCKET_NOT_FOUND,
    /**
     * Content not found
     */
    CONTENT_NOT_FOUND,
    /**
     * Bucket doesn't exist
     */
    BUCKET_NOT_EXISTS,
    /**
     * Bucket already exist
     */
    BUCKET_ALREADY_EXISTS,
    /**
     * Bucket in read-only mode
     */
    BUCKET_READONLY,
    /**
     * Bucket is not empty
     */
    BUCKET_NOT_EMPTY,
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
