package io.codebyexample.jsonutils.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Base64;

/**
 * @author huypva
 */
public class GsonUtils {

  private static final Gson GSON = new GsonBuilder().create();

  private GsonUtils() {}

  public static <T> T fromJson(String json, Class<T> clazz) {
    return GSON.fromJson(json, clazz);
  }

  public static <T> T fromJson(String json, TypeToken<T> type) {
    return GSON.fromJson(json, type.getType());
  }

  public static String toJson(Object obj) {
    return GSON.toJson(obj);
  }


}
