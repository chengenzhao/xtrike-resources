package com.whitewoodcity.xtrikeresources.clancy;

public enum Action {
  IDLE("idle.act");

  final String act;

  Action(String act) {
    this.act = act;
  }

  public String getJsonString(){
    try (var inputStream = Clancy.class.getResourceAsStream(act)){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
