package com.whitewoodcity.xtrikeresources.monsters.bones;

import io.javafx.whitewoodcity.JsonFile;

public enum Animation implements JsonFile {
  IDLE("idle.act"),
  WALK("walk.act"),
  ATTACK("attack.act"),
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
