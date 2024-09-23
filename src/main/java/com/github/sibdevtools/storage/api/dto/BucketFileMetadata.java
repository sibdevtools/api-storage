package com.github.sibdevtools.storage.api.dto;

import jakarta.annotation.Nonnull;

import java.util.Set;

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
    String get(@Nonnull String key);

    /**
     * Get set of attribute names
     *
     * @return set of names
     */
    Set<String> getAttributeNames();
}
