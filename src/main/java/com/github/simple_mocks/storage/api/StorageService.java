package com.github.simple_mocks.storage.api;

import java.util.Map;

/**
 * Storage service interface.<br/>
 * Describe all possible interactions with simple storage service.<br/>
 * In case if some method raise an unexpected error {@link StorageErrors#UNEXPECTED_ERROR} should be thrown.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface StorageService {

    /**
     * Get content from storage.<br/>
     * In case if content not found {@link StorageErrors#NOT_FOUND} should be throws.
     *
     * @param id content id
     * @return content
     */
    Content get(String id);

    /**
     * Delete content from storage.<br/>
     * In case if bucket is readonly {@link StorageErrors#BUCKET_READONLY} should be thrown.
     * In case if content is not found in storage, nothing should be changed.
     *
     * @param id content id
     */
    void delete(String id);

    /**
     * Create content in storage.<br/>
     * In case if bucket doesn't exist {@link StorageErrors#BUCKET_NOT_EXISTS} should be thrown.<br/>
     * In case if bucket is readonly {@link StorageErrors#BUCKET_READONLY} should be thrown.
     *
     * @param bucket  path for content saving
     * @param name    content name can be useful for represent content on UI
     * @param meta    meta-attributes of content
     * @param content content as a binary array
     * @return content id
     */
    String create(String bucket, String name, Map<String, String> meta, byte[] content);

}
