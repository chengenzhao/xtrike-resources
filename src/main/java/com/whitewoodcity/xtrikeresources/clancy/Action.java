package com.whitewoodcity.xtrikeresources.clancy;

public enum Action implements JsonFile {
  WALK("walk.act"),
  RUN("run.act"),
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
