package com.whitewoodcity.xtrikeresources.landscape;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum Landscape implements JsonFile {
  CLOUD("cloud.jvg");

  final String jvg;

  Landscape(String jvg) {
    this.jvg = jvg;
  }

  @Override
  public String getFileName() {
    return jvg;
  }
}
