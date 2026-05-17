package com.whitewoodcity.xtrikeresources.terrain;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum JVGComponent implements JsonFile {
  GRASS("grass.jvg");

  final String jvg;

  JVGComponent(String jvg) {
    this.jvg = jvg;
  }

  @Override
  public String getFileName() {
    return jvg;
  }
}
