package com.whitewoodcity.xtrikeresources.clancy;

public enum Component {

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
  RIGHT_WRIST ("right_wrist.jvg",2);

  final String jvg;
  final int rotateNum;

  Component(String jvg, int rotateNum) {
    this.jvg = jvg;
    this.rotateNum = rotateNum;
  }

  public String getJsonString(){
    try (var inputStream = Clancy.class.getResourceAsStream(jvg)){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
