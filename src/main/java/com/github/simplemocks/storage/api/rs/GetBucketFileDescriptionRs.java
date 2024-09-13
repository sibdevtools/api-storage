package com.github.simplemocks.storage.api.rs;

import com.github.simplemocks.common.api.dto.ErrorRsDto;
import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.storage.api.dto.BucketFileDescription;
import jakarta.annotation.Nonnull;

/**
 * Get bucket file description response
 *
 * @author sibmaks
 * @since 0.0.11
 */
public class GetBucketFileDescriptionRs extends StandardBodyRs<BucketFileDescription> {

    /**
     * Construct get bucket file description response
     *
     * @param bucketFileDescription bucket file description
     */
    public GetBucketFileDescriptionRs(@Nonnull BucketFileDescription bucketFileDescription) {
        super(bucketFileDescription);
    }

    /**
     * Construct get bucket file description response with error
     *
     * @param error happened error
     */
    public GetBucketFileDescriptionRs(@Nonnull ErrorRsDto error) {
        super(error);
    }
}
