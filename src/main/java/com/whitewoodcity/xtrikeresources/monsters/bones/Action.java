package com.whitewoodcity.xtrikeresources.monsters.bones;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Action implements JsonFile {
  IDLE("idle.act"),
  WALK("walk.act"),
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
