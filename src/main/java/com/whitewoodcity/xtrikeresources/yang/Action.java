package com.whitewoodcity.xtrikeresources.yang;

public enum Action implements JsonFile {
  IDLE("idle.act");

  final String act;

  Action(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
