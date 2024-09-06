package com.github.simple_mocks.storage.api.service;

import com.github.simple_mocks.storage.api.dto.Bucket;
import com.github.simple_mocks.storage.api.rq.SetReadOnlyModeRq;
import jakarta.annotation.Nonnull;

/**
 * Definition of storage bucket service
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface StorageBucketService {
    /**
     * Create bucket in storage.<br/>
     * In case if bucket already exist exception should be thrown.<br/>
     *
     * @param code bucket code
     */
    void create(@Nonnull String code);

    /**
     * Get a list of bucket contents from storage.<br/>
     * In case if a bucket is not found, exception should be thrown.
     *
     * @param code bucket code
     * @return bucket information
     */
    @Nonnull
    Bucket get(@Nonnull String code);

    /**
     * Change read-only flag for bucket.<br/>
     * In case if bucket not found exception should be thrown.<br/>
     * In case if bucket has the same flag, nothing should be done.
     *
     * @param rq change mode request
     */
    void setReadOnly(@Nonnull SetReadOnlyModeRq rq);

    /**
     * Delete bucket from storage.<br/>
     * In case if some content exists in the bucket, exception should be thrown.
     *
     * @param code bucket code
     */
    void delete(@Nonnull String code);
}
