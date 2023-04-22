package com.github.sibmaks.storage.api;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * Definition of type Content.
 *
 * @author sibmaks
 * @since 2023-04-11
 */
public interface Content {
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
     * Content binary array
     *
     * @return content as binary array
     */
    byte[] getContent();

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
