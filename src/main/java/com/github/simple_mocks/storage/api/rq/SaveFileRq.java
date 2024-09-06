package com.github.simple_mocks.storage.api.rq;

import jakarta.annotation.Nonnull;
import lombok.Builder;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 * Create file request
 *
 * @param bucket path for content saving
 * @param name   content name can be useful for represent content on UI
 * @param meta   meta-attributes of content
 * @param data   file content as a binary array
 * @author sibmaks
 * @since 0.0.7
 */
@Builder
public record SaveFileRq(@Nonnull String bucket,
                         @Nonnull  String name,
                         @Nonnull Map<String, String> meta,
                         @Nonnull byte[] data) {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        var that = (SaveFileRq) o;
        return Objects.equals(name, that.name) &&
                Objects.deepEquals(data, that.data) &&
                Objects.equals(bucket, that.bucket) &&
                Objects.equals(meta, that.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, name, meta, Arrays.hashCode(data));
    }

    @Override
    public String toString() {
        return "CreateFileRq{" +
                "meta=" + meta +
                ", name='" + name + '\'' +
                ", bucket='" + bucket + '\'' +
                ", data='" + data.length + '\'' +
                '}';
    }
}
