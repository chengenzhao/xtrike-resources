package com.whitewoodcity.xtrikeresources.empire.soldier;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  LEFT_SHOULDER("left_shoulder.jvg",1),
  HEAD("head.jvg",1),
  LEFT_ARM("left_arm.jvg",1),
  RIGHT_HAND("right_hand.jvg",2),
  GUN("gun.jvg",1),
  LEFT_THIGH("left_thigh.jvg",1),
  LEFT_SHOE("left_shoe.jvg",3),
  LEFT_CALF("left_calf.jvg",2),
  BODY("body.jvg",1),
  RIGHT_ARM("right_arm.jvg",1),
  RIGHT_THIGH("right_thigh.jvg",1),
  RIGHT_CALF("right_calf.jvg",2),
  RIGHT_SHOE("right_shoe.jvg",3),
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
