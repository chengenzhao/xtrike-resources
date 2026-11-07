package com.whitewoodcity.xtrikeresources.monsters.orcus;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Animation implements JsonFile {
  IDLE("idle.act"),
  ATTACK("attack.act"),
  WALK("walk.act"),
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
