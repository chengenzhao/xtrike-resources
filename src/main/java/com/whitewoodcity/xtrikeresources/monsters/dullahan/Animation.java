package com.whitewoodcity.xtrikeresources.monsters.dullahan;

import io.javafx.whitewoodcity.JsonFile;

public enum Animation implements JsonFile {
  IDLE("idle.act"),
  THRUST("thrust.act"),
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
