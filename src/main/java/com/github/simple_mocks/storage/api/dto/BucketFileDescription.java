package com.github.simple_mocks.storage.api.dto;

import jakarta.annotation.Nonnull;

import java.time.ZonedDateTime;

/**
 * Definition of type content in bucket.
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface BucketFileDescription {
    /**
     * Content identification in storage
     *
     * @return content id
     */
    @Nonnull
    String getId();

    /**
     * Content name
     *
     * @return content name
     */
    @Nonnull
    String getName();

    /**
     * Content meta attributes
     *
     * @return meta attributes
     */
    @Nonnull
    BucketFileMetadata getMeta();

    /**
     * Date of content creation
     *
     * @return creation date
     */
    @Nonnull
    ZonedDateTime getCreatedAt();

    /**
     * Date of content last modification
     *
     * @return modification date
     */
    @Nonnull
    ZonedDateTime getModifiedAt();
}
