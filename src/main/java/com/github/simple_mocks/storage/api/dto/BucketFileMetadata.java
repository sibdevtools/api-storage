package com.github.simple_mocks.storage.api.dto;

import jakarta.annotation.Nonnull;

/**
 * Definition of type bucket's file's metadata.
 *
 * @author sibmaks
 * @since 0.0.7
 */
public interface BucketFileMetadata {
    /**
     * Get content metadata value by key
     *
     * @param key metadata key
     * @return metadata value
     */
    @Nonnull
    String get(String key);
}
