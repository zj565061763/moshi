package com.sd.lib.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

final class NullSafePrimitiveAdapterFactory implements JsonAdapter.Factory {
    @Override
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (!annotations.isEmpty()) return null;
        if (type == boolean.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == byte.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == char.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == double.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == float.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == int.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == long.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        if (type == short.class) return moshi.nextAdapter(this, type, annotations).nullSafe();
        return null;
    }
}