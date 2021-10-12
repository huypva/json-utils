package io.codebyexample.jsonutils.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;

/**
 * @author huypva
 */
public class JacksonUtils {

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public static <T> T fromJson(String json, Class<T> clazz) throws JacksonParserException {
    try {
      return OBJECT_MAPPER.readValue(json, clazz);
    } catch (JsonProcessingException e) {
      throw new JacksonParserException(e);
    }
  }

  public static <T> T fromJson(String json, TypeReference<T> type) throws JacksonParserException {
    try {
      return OBJECT_MAPPER.readValue(json, type);
    } catch (JsonProcessingException e) {
      throw new JacksonParserException(e);
    }
  }

  public static String toJson(Object obj) throws JacksonParserException {
    try {
      return OBJECT_MAPPER.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      throw new JacksonParserException(e);
    }
  }

}
