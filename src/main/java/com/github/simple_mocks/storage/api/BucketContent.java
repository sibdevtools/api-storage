package com.github.simple_mocks.storage.api;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * Definition of type content in bucket.
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface BucketContent {
    /**
     * Content identification in storage
     *
     * @return content id
     */
    String getId();

    /**
     * Content name
     *
     * @return content name
     */
    String getName();

    /**
     * Content meta attributes
     *
     * @return meta attributes
     */
    Map<String, String> getMeta();

    /**
     * Date of content creation
     *
     * @return creation date
     */
    ZonedDateTime getCreatedAt();

    /**
     * Date of content last modification
     *
     * @return modification date
     */
    ZonedDateTime getModifiedAt();
}
