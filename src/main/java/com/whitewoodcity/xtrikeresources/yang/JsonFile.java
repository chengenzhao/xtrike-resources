package com.whitewoodcity.xtrikeresources.yang;

public interface JsonFile {

  String getFileName();

  default String getJsonString(){
    try (var inputStream = Yang.class.getResourceAsStream(getFileName())){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
