package com.whitewoodcity.xtrikeresources.effects.muzzleflash;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Footage implements JsonFile {

  FLASH("flash.jvgs"),
  ;

  final String jvgs;

  Footage(String jvg) {
    this.jvgs = jvg;
  }

  @Override
  public String getFileName() {
    return jvgs;
  }
}
