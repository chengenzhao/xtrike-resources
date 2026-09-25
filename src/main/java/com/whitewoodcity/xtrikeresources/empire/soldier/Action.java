package com.whitewoodcity.xtrikeresources.empire.soldier;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Action implements JsonFile {
  IDLE("idle.act"),
  WALK("walk.act"),
  THRUST("thrust.act"),
  SHOOT("shoot.act"),
  ;

  final String act;

  Action(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
