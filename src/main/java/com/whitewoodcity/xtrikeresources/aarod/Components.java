package com.whitewoodcity.xtrikeresources.aarod;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  HEAD          ("head.jvg", 1),
  LEFT_SHOULDER ("left_shoulder.jvg",1),
  BODY          ("body.jvg",1),
  RIGHT_SHOULDER("right_shoulder.jvg",1),
  RIGHT_HAND    ("right_hand.jvg",2),
  RIGHT_ARM     ("right_arm.jvg",1),
  LEFT_HAND     ("left_hand.jvg",2),
  LEFT_ARM      ("left_arm.jvg",1),
  LEFT_FOOT     ("left_foot.jvg",3),
  LEFT_CALF     ("left_calf.jvg",2),
  LEFT_THIGH    ("left_thigh.jvg",1),
  RIGHT_FOOT    ("right_foot.jvg",3),
  RIGHT_CALF    ("right_calf.jvg",2),
  RIGHT_THIGH   ("right_thigh.jvg",1),

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
