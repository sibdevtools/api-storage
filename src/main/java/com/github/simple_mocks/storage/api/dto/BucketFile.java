package com.github.simple_mocks.storage.api.dto;

import jakarta.annotation.Nonnull;

/**
 * Definition of a file with content in a bucket.
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface BucketFile {

    /**
     * Bucket file description
     *
     * @return bucket file description
     */
    @Nonnull
    BucketFileDescription getDescription();

    /**
     * File content in storage
     *
     * @return file content
     */
    @Nonnull
    byte[] getData();
}
