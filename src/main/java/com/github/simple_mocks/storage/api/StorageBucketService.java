package com.github.simple_mocks.storage.api;

import java.util.List;

/**
 * Definition of storage bucket service
 *
 * @author sibmaks
 * @since 0.0.5
 */
public interface StorageBucketService {
    /**
     * Create bucket in storage.<br/>
     * In case if bucket already exist {@link StorageErrors#BUCKET_ALREADY_EXISTS} should be thrown.<br/>
     *
     * @param code bucket code
     */
    void create(String code);

    /**
     * Get list of bucket contents from storage.<br/>
     * In case if bucket not found {@link StorageErrors#BUCKET_NOT_FOUND} should be throws.
     *
     * @param code bucket code
     * @return list of bucket contents
     */
    List<BucketContent> get(String code);

    /**
     * Change read only flag for bucket..<br/>
     * In case if bucket not found {@link StorageErrors#BUCKET_NOT_FOUND} should be throws.<br/>
     * In case if bucket has same flag, nothing should be done.
     *
     * @param code     bucket code
     * @param readOnly read only flag
     */
    void setReadOnly(String code, boolean readOnly);

    /**
     * Delete bucket from storage.<br/>
     * In case if bucket is readonly {@link StorageErrors#BUCKET_READONLY} should be thrown.
     * In case if some content exists in bucket {@link StorageErrors#BUCKET_NOT_EMPTY} should be thrown.
     *
     * @param code bucket code
     */
    void delete(String code);
}
