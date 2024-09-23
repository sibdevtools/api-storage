package com.github.sibdevtools.storage.api.dto;

import jakarta.annotation.Nonnull;

import java.io.Serializable;

/**
 * Definition of a file with content in a bucket.
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface BucketFile extends Serializable {

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
