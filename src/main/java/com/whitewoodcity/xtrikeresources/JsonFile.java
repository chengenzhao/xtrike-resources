package com.whitewoodcity.xtrikeresources;

public interface JsonFile {

  String getFileName();

  default String getJsonString(){
    try (var inputStream = getClass().getResourceAsStream(getFileName())){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
