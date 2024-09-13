package com.github.simplemocks.storage.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

/**
 * Change read-only mode request
 *
 * @param code     bucket code
 * @param readOnly read-only a flag
 * @author sibmaks
 * @since 0.0.7
 */
@Builder
public record SetReadOnlyModeRq(@Nonnull String code,
                                boolean readOnly) {
}
