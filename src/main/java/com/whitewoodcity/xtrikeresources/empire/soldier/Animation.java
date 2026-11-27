package com.whitewoodcity.xtrikeresources.empire.soldier;

import io.javafx.whitewoodcity.JsonFile;

public enum Animation implements JsonFile {
  IDLE("idle.act"),
  WALK("walk.act"),
  THRUST("thrust.act"),
  SHOOT("shoot.act"),
  ;

  final String act;

  Animation(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }
}
