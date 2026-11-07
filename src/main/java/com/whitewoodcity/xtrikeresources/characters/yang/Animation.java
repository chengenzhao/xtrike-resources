package com.whitewoodcity.xtrikeresources.characters.yang;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Animation implements JsonFile {
  IDLE("idle.act");

  final String act;

  Animation(String act) {
    this.act = act;
  }

  @Override
  public String getFileName() {
    return act;
  }

}
