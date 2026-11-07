package com.whitewoodcity.xtrikeresources.characters.clancy;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Animation implements JsonFile {
  WALK("walk.act"),
  RUN("run.act"),
  JUMP("jump.act"),
  IDLE("idle.act"),

  ALERT("alert.act"),
  SHOOT("shoot.act"),
  FIRE("fire.act"),

  FLAME("flame.act");

  final String act;

  Animation(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
