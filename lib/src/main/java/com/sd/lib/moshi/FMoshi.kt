package com.sd.lib.moshi

import com.squareup.moshi.Moshi

val fMoshi: Moshi = Moshi.Builder()
    .add(NullSafePrimitiveAdapterFactory())
    .addLast(FKotlinJsonAdapterFactory())
    .build()