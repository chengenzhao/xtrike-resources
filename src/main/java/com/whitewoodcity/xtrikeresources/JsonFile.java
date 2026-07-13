package com.whitewoodcity.xtrikeresources;

public interface JsonFile {

  String getFileName();

  Class<?> getCurrentClass();

  //make sure the jvg files are in the same folder of class file
  default String getJsonString(){
    try (var inputStream = getCurrentClass().getResourceAsStream(getFileName())){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
