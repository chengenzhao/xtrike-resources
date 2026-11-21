package com.whitewoodcity.xtrikeresources.characters.clancy;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {

  HEAD        ("head.jvg", 1),
  BODY_BACK   ("body_back.jvg", 1),
  BODY_FRONT  ("body_front.jvg",1),
  LEFT_ARM    ("left_arm.jvg",1),
  LEFT_CALF   ("left_calf.jvg",2),
  LEFT_ELBOW  ("left_elbow.jvg",2),
  LEFT_KNEE   ("left_knee.jvg",2),
  LEFT_SHOE   ("left_shoe.jvg",3),
  LEFT_THIGH  ("left_thigh.jvg",1),
  LEFT_WRIST  ("left_wrist.jvg",3),
  RIGHT_ARM   ("right_arm.jvg",1),
  RIGHT_CALF  ("right_calf.jvg",2),
  RIGHT_KNEE  ("right_knee.jvg",2),
  RIGHT_SHOE  ("right_shoe.jvg",3),
  RIGHT_THIGH ("right_thigh.jvg",1),
  RIGHT_WRIST ("right_wrist.jvg",2),

  //weapons
  SCARL       ("scarl.jvg",1),
  RIGHT_PALM  ("right_palm.jvg",1),

  //mug
  HAIR0("hair0.jvg",1),
  HAIR1("hair1.jvg",1),
  HAIR2("hair2.jvg",1),
  HEADBAND("headband.jvg",1),
  HAIR4("hair4.jvg",1),
  HAIR3("hair3.jvg",1),
  HAIR5("hair5.jvg",1),
  HAIR6("hair6.jvg",1),
  LEFT_EYE("left_eye.jvg",1),
  RIGHT_EYE("right_eye.jvg",1),
  NOSE("nose.jvg",1),
  MOUTH("mouth.jvg",1),
  FACE("face.jvg",1),
  HAIR7("hair7.jvg",1),
  EAR("ear.jvg",1),
  HAIR8("hair8.jvg",1),
  COLLARBONE_LINE("collarbone_line.jvg",1),
  RIGHT_SHOULDER("right_shoulder.jvg",1),
  NECK("neck.jvg",1),
  LEFT_SHOULDER("left_shoulder.jvg",1),
  T_SHIRT("t_shirt.jvg",1),
  HAIR9("hair9.jvg",1),
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
