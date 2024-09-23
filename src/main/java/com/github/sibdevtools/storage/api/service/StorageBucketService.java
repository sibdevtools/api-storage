package com.github.sibdevtools.storage.api.service;

import com.github.sibdevtools.common.api.rs.StandardRs;
import com.github.sibdevtools.storage.api.rq.SetReadOnlyModeRq;
import com.github.sibdevtools.storage.api.rs.GetBucketRs;
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
     * @return standard response
     */
    @Nonnull
    StandardRs create(@Nonnull String code);

    /**
     * Get a list of bucket contents from storage.<br/>
     * In case if a bucket is not found, exception should be thrown.
     *
     * @param code bucket code
     * @return bucket information
     */
    @Nonnull
    GetBucketRs get(@Nonnull String code);

    /**
     * Change read-only flag for bucket.<br/>
     * In case if bucket not found exception should be thrown.<br/>
     * In case if bucket has the same flag, nothing should be done.
     *
     * @param rq change mode request
     * @return standard response
     */
    @Nonnull
    StandardRs setReadOnly(@Nonnull SetReadOnlyModeRq rq);

    /**
     * Delete bucket from storage.<br/>
     * In case if some content exists in the bucket, exception should be thrown.
     *
     * @param code bucket code
     * @return standard response
     */
    @Nonnull
    StandardRs delete(@Nonnull String code);
}
