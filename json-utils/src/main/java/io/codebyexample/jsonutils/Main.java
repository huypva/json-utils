package io.codebyexample.jsonutils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.reflect.TypeToken;
import io.codebyexample.jsonutils.example.GsonAnnotationObject;
import io.codebyexample.jsonutils.example.SampleObject;
import io.codebyexample.jsonutils.utils.GsonUtils;
import io.codebyexample.jsonutils.utils.JacksonUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    gsonExample();

    jacksonExample();
  }


  public static void gsonExample() {
    System.out.println("===GsonExample===");
    System.out.println("=ToJson=");
    SampleObject objectExample = new SampleObject(1, "A");
    System.out.println(GsonUtils.toJson(objectExample));

    System.out.println("=FromJson=");
    String str = "{\"objectId\":1,\"objectName\":\"A\"}";
    SampleObject object = GsonUtils.fromJson(str, SampleObject.class);
    System.out.println(object.toString());

    System.out.println("=FromJsonArray=");
    Map<Integer, SampleObject> objList = new HashMap<>();
    objList.put(1, new SampleObject(1, "Nguyen Van A"));
    objList.put(2, new SampleObject(2, "Nguyen Van B"));
    System.out.println(GsonUtils.toJson(objList));

    String strArr = "{\"1\":{\"objectId\":1,\"objectName\":\"Nguyen Van A\"},\"2\":{\"objectId\":2,\"objectName\":\"Nguyen Van B\"}}";
    Map<Integer, SampleObject> list = GsonUtils.fromJson(strArr, new TypeToken<Map<Integer, SampleObject>>() {});
    list.forEach((x,y) -> System.out.println(x + "->" + y));


    System.out.println("=Annotation=");
    GsonAnnotationObject annotationObject = new GsonAnnotationObject(1, "A");
    System.out.println(GsonUtils.toJson(annotationObject));

  }

  public static void jacksonExample() {
    System.out.println("===JacksonExample===");
    System.out.println("ToJson");
    SampleObject objectExample = new SampleObject(1, "A");
    System.out.println(JacksonUtils.toJson(objectExample));

    System.out.println("=FromJson=");
    String str = "{\"objectId\":1,\"objectName\":\"A\"}";
    SampleObject object = JacksonUtils.fromJson(str, SampleObject.class);
    System.out.println(object.toString());

    System.out.println("=FromJsonArray=");
    Map<Integer, SampleObject> objList = new HashMap<>();
    objList.put(1, new SampleObject(1, "Nguyen Van A"));
    objList.put(2, new SampleObject(2, "Nguyen Van B"));
    System.out.println(JacksonUtils.toJson(objList));

    String strArr = "{\"1\":{\"objectId\":1,\"objectName\":\"Nguyen Van A\"},\"2\":{\"objectId\":2,\"objectName\":\"Nguyen Van B\"}}";
    Map<Integer, SampleObject> list = JacksonUtils.fromJson(strArr, new TypeReference<Map<Integer, SampleObject>>(){});
    list.forEach((x,y) -> System.out.println(x + "->" + y));

    System.out.println("=Annotation=");
    GsonAnnotationObject annotationObject = new GsonAnnotationObject(1, "A");
    System.out.println(GsonUtils.toJson(annotationObject));
  }
}
