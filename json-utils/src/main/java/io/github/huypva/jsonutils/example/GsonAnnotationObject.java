package io.github.huypva.jsonutils.example;

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
public class GsonAnnotationObject {

  @SerializedName("object_id")
  public int objectId;

  @SerializedName("object_name")
  public String objectName;

}
