package com.whitewoodcity.xtrikeresources.clancy;

public enum Component implements JsonFile {

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

  //flame
  FLAMEA      ("flame0.jvg",1),
  FLAMEB      ("flame1.jvg",1),
  FLAMEC      ("flame2.jvg",1),
  FLAMED      ("flame3.jvg",1),
  ;

  final String jvg;
  final int rotateNum;

  Component(String jvg, int rotateNum) {
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
