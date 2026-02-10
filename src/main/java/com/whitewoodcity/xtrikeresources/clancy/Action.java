package com.whitewoodcity.xtrikeresources.clancy;

public enum Action implements JsonFile {
  TEST("test.act"),
  IDLE("idle.act"),
  WALK("walk.act");

  final String act;

  Action(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
