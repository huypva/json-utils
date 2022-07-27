package io.github.huypva.jsonutils.example;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author huypva
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JacksonAnnotationObject {

  @JsonAlias("object_id")
  public int objectId;

  @JsonAlias("object_name")
  public String objectName;

}
