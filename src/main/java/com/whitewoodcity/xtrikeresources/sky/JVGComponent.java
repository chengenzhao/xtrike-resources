package com.whitewoodcity.xtrikeresources.sky;

import com.whitewoodcity.xtrikeresources.JsonFile;

public enum JVGComponent implements JsonFile {
  CLOUD("cloud.jvg");

  final String jvg;

  JVGComponent(String jvg) {
    this.jvg = jvg;
  }

  @Override
  public String getFileName() {
    return jvg;
  }
}
