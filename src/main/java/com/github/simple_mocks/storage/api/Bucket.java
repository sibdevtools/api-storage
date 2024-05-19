package com.github.simple_mocks.storage.api;

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
    String getCode();

    /**
     * Is bucket read-only. Readonly means that content can not be modified in bucket.<br/>
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
    ZonedDateTime getCreatedAt();

    /**
     * Zoned date of bucket last modification.
     *
     * @return modification date
     */
    ZonedDateTime getModifiedAt();

    /**
     * List of bucket contents.
     *
     * @return bucket contents
     */
    List<BucketContent> getContents();

}
