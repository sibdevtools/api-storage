package com.github.sibdevtools.storage.api.service;

import com.github.sibdevtools.common.api.rs.StandardRs;
import com.github.sibdevtools.storage.api.rq.SaveFileRq;
import com.github.sibdevtools.storage.api.rs.GetBucketFileDescriptionRs;
import com.github.sibdevtools.storage.api.rs.GetBucketFileRs;
import com.github.sibdevtools.storage.api.rs.SaveFileRs;
import jakarta.annotation.Nonnull;

/**
 * Storage service interface.<br/>
 * Describe all possible interactions with simple storage service.<br/>
 * In case if some method raises an unexpected error, exception should be thrown.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface StorageService {

    /**
     * Get content from storage.<br/>
     * In case if bucket not found exception should be thrown.<br/>
     * In case if content is not found, exception should be thrown.
     *
     * @param id content id
     * @return bucket file
     */
    @Nonnull
    GetBucketFileRs get(@Nonnull String id);

    /**
     * Get stored file description, without content.<br/>
     * In case if content is not found, exception should be thrown.
     *
     * @param id content id
     * @return file description
     */
    @Nonnull
    GetBucketFileDescriptionRs getDescription(@Nonnull String id);

    /**
     * Delete file from storage.<br/>
     * In case if bucket is readonly exception should be thrown.<br/>
     * In case if content is not found in storage, nothing should be changed.
     *
     * @param id content id
     * @return standard response
     */
    @Nonnull
    StandardRs delete(@Nonnull String id);

    /**
     * Create a file in storage.<br/>
     * In case if bucket doesn't exist exception should be thrown.<br/>
     * In case if bucket is readonly exception should be thrown.
     *
     * @param rq creation request
     * @return content id
     */
    @Nonnull
    SaveFileRs save(@Nonnull SaveFileRq rq);

}
