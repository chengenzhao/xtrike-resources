package com.whitewoodcity.xtrikeresources.clancy;

public enum Action implements JsonFile {
  WALK("walk.act"),
  RUN("run.act"),
  JUMP("jump.act"),
  IDLE("idle.act"),

  ALERT("alert.act"),SHOOT("shoot.act"),FIRE("fire.act");

  final String act;

  Action(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
