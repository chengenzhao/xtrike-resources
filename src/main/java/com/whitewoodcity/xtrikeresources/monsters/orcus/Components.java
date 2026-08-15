package com.whitewoodcity.xtrikeresources.monsters.orcus;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  RIGHT_PALM  ("right_palm.jvg",3),
  LEFT_HAND   ("left_hand.jvg",2),
  LEFT_PALM   ("left_palm.jvg",3),
  POLE_AXE    ("pole_axe.jvg",4),
  HEAD        ("head.jvg",2),
  LEFT_ARM    ("left_arm.jvg",1),
  BODY        ("body.jvg",1),
  RIGHT_ARM   ("right_arm.jvg",1),
  LEFT_SHOE   ("left_shoe.jvg",3),
  LEFT_LEG    ("left_leg.jvg",2),
  LEFT_THIGH  ("left_thigh.jvg",1),
  RIGHT_HAND  ("right_hand.jvg",2),
  RIGHT_SHOE  ("right_shoe.jvg",3),
  RIGHT_LEG   ("right_leg.jvg",2),
  RIGHT_THIGH ("right_thigh.jvg",1),
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
