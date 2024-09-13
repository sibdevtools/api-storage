package com.github.simplemocks.storage.api.rs;

import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.storage.api.dto.Bucket;
import jakarta.annotation.Nonnull;

/**
 * Get bucket response
 *
 * @author sibmaks
 * @since 0.0.11
 */
public class GetBucketRs extends StandardBodyRs<Bucket> {

    /**
     * Construct get bucket response
     *
     * @param bucket bucket
     */
    public GetBucketRs(@Nonnull Bucket bucket) {
        super(bucket);
    }
}
