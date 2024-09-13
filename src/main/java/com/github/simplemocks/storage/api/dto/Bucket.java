package com.github.simplemocks.storage.api.dto;

import jakarta.annotation.Nonnull;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Definition of bucket.
 *
 * @author sibmaks
 * @since 0.0.6
 */
public interface Bucket {

    /**
     * Get bucket code
     *
     * @return bucket code
     */
    @Nonnull
    String getCode();

    /**
     * Is bucket read-only. Readonly means that content cannot be modified in bucket.<br/>
     * But empty read-only bucket can be deleted.
     *
     * @return read-only status
     */
    boolean isReadOnly();

    /**
     * Zoned date of bucket creation.
     *
     * @return creation date
     */
    @Nonnull
    ZonedDateTime getCreatedAt();

    /**
     * Zoned date of bucket-last modification.
     *
     * @return modification date
     */
    @Nonnull
    ZonedDateTime getModifiedAt();

    /**
     * List of bucket contents.
     *
     * @return bucket contents
     */
    @Nonnull
    List<BucketFileDescription> getContents();

}
