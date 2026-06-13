package com.whitewoodcity.xtrikeresources.monsters.bones;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  BLADE("blade.jvg",1),
  HEAD("head.jvg",1),
  RIGHT_ARM("right_arm.jvg",1),
  ;

  final String jvg;
  final int rotateNum;

  Components(String jvg, int rotateNum) {
    this.jvg = jvg;
    this.rotateNum = rotateNum;
  }

  public int rotateNum() {
    return rotateNum;
  }

  @Override
  public String getFileName() {
    return jvg;
  }
}
