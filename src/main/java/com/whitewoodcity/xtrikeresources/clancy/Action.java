package com.whitewoodcity.xtrikeresources.clancy;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Action implements JsonFile {
  WALK("walk.act"),
  RUN("run.act"),
  JUMP("jump.act"),
  IDLE("idle.act"),

  ALERT("alert.act"),
  SHOOT("shoot.act"),
  FIRE("fire.act"),

  FLAME("flame.act");

  final String act;

  Action(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }

  @Override
  public Class<Action> getCurrentClass() {
    return Action.class;
  }


}
