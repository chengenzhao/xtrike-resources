package com.whitewoodcity.xtrikeresources.empire.kaelzor;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {

  LEFT_SHOULDER("left_shoulder.jvg",1),
  LEFT_ARM("left_arm.jvg",1),
  LEFT_SHOULD_BACK("left_should_back.jvg",1),
  LEFT_HAND("left_hand.jvg",2),
  ROBE_TAIL_LEFT_BACK("robe_tail_left_back.jvg",1),
  LEFT_SHOE("left_shoe.jvg",3),
  LEFT_KNEE("left_knee.jvg",1),
  LEFT_LEG("left_leg.jvg",2),
  LEFT_THIGH("left_thigh.jvg",1),
  ROBE_FRONT("robe_front.jvg",1),
  HEAD("head.jvg",1),
  BODY("body.jvg",1),
  RIGHT_ARM("right_arm.jvg",1),
  RIGHT_KNEE("right_knee.jvg",1),
  RIGHT_THIGH("right_thigh.jvg",1),
  RIGHT_HAND("right_hand.jvg",2),
  RIGHT_SHOE("right_shoe.jvg",3),
  RIGHT_LEG("right_leg.jvg",2),
  ROBE_TAIL("robe_tail.jvg",1),

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
