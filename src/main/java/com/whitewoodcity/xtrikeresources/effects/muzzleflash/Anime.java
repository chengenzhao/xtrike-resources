package com.whitewoodcity.xtrikeresources.effects.muzzleflash;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Anime implements JsonFile {

  FLASH("flash.ani"),
  ;

  final String ani;

  Anime(String act) {
    this.ani = act;
  }

  @Override
  public String getFileName() {
    return ani;
  }
}
