package com.github.simple_mocks.storage.api.service;

import com.github.simple_mocks.storage.api.dto.BucketFile;
import com.github.simple_mocks.storage.api.dto.BucketFileMetadata;
import com.github.simple_mocks.storage.api.rq.SaveFileRq;
import jakarta.annotation.Nonnull;

/**
 * Storage service interface.<br/>
 * Describe all possible interactions with simple storage service.<br/>
 * In case if some method raises an unexpected error, "UNEXPECTED_ERROR" should be thrown.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface StorageService {

    /**
     * Get content from storage.<br/>
     * In case if bucket not found "BUCKET_NOT_EXISTS" should be throws.<br/>
     * In case if content is not found, "CONTENT_NOT_FOUND" should be throws.
     *
     * @param id content id
     * @return bucket file
     */
    @Nonnull
    BucketFile get(@Nonnull String id);

    /**
     * Get stored file metadata.<br/>
     * In case if content is not found, "NOT_FOUND" should be throws.
     *
     * @param id content id
     * @return content metadata
     */
    @Nonnull
    BucketFileMetadata getMeta(@Nonnull String id);

    /**
     * Delete file from storage.<br/>
     * In case if bucket is readonly "BUCKET_READONLY" should be thrown.<br/>
     * In case if content is not found in storage, nothing should be changed.
     *
     * @param id content id
     */
    void delete(@Nonnull String id);

    /**
     * Create a file in storage.<br/>
     * In case if bucket doesn't exist "BUCKET_NOT_EXISTS" should be thrown.<br/>
     * In case if bucket is readonly "BUCKET_READONLY" should be thrown.
     *
     * @param rq creation request
     * @return content id
     */
    @Nonnull
    String save(@Nonnull SaveFileRq rq);

}
