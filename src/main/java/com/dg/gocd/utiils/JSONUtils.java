package com.dg.gocd.utiils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author dima.golomozy
 */
public final class JSONUtils {
    // TODO: 24/07/18 dima.golomozy - move the ObjectMapper
    private static final Gson gson = new GsonBuilder().serializeNulls().create();

    public static <T> T fromJSON(String json, Class<T> classOfT)
    {
        return gson.fromJson(json, classOfT);
    }

    public static <T> String toJSON(T map) {
        return gson.toJson(map);
    }
}
