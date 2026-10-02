package com.whitewoodcity.xtrikeresources.effects.muzzleflash;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Components implements JsonFile {
  FLASH0("flash0.jvg"),
  FLASH1("flash1.jvg"),
  FLASH2("flash2.jvg"),
  FLASH3("flash3.jvg"),
  FLASH4("flash4.jvg"),
  FLASH5("flash5.jvg"),
  ;

  final String jvg;

  Components(String jvg) {
    this.jvg = jvg;
  }

  @Override
  public String getFileName() {
    return jvg;
  }

  }
