package com.whitewoodcity.xtrikeresources.clancy;

public interface JsonFile {

  String getFileName();

  default String getJsonString(){
    try (var inputStream = Clancy.class.getResourceAsStream(getFileName())){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
