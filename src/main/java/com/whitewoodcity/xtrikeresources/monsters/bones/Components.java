package com.whitewoodcity.xtrikeresources.monsters.bones;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  BLADE("blade.jvg",1),
  HEAD("head.jvg",1),
  RIGHT_ARM("right_arm.jvg",1),
  LEFT_SHOULDER("left_shoulder.jvg",1),
  LEFT_ARM("left_arm.jvg",1),
  LEFT_HAND("left_hand.jvg",1),
  LEFT_FOOT("left_foot.jvg",1),
  RIGHT_FOOT("right_foot.jvg",1),
  BODY("body.jvg",1),
  LEFT_THIGH("left_thigh",1),
  RIGHT_THIGH("right_thigh",1),
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
