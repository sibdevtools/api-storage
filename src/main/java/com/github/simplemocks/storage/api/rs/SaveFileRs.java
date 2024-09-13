package com.github.simplemocks.storage.api.rs;

import com.github.simplemocks.common.api.rs.StandardBodyRs;
import jakarta.annotation.Nonnull;

/**
 * Save file response
 *
 * @author sibmaks
 * @since 0.0.11
 */
public class SaveFileRs extends StandardBodyRs<String> {

    /**
     * Construct save files response
     *
     * @param bucketFileId bucket file identifier
     */
    public SaveFileRs(@Nonnull String bucketFileId) {
        super(bucketFileId);
    }
}
