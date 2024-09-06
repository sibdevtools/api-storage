package com.github.simple_mocks.storage.api.rq;

import jakarta.annotation.Nonnull;

/**
 * Change read-only mode request
 *
 * @param code     bucket code
 * @param readOnly read-only a flag
 * @author sibmaks
 * @since 0.0.7
 */
public record SetReadOnlyModeRq(@Nonnull String code,
                                boolean readOnly) {
}
