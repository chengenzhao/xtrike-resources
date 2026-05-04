package com.whitewoodcity.xtrikeresources.yang;

import com.whitewoodcity.xtrikeresources.clancy.JsonFile;

public enum Action implements JsonFile {
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
