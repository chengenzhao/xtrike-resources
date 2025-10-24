package com.whitewoodcity.xtrikeresources.clancy;

public enum Component {

  HEAD        ("head.jvg"),
  BODY_BACK   ("body_back.jvg"),
  BODY_FRONT  ("body_front.jvg"),
  LEFT_ARM    ("left_arm.jvg"),
  LEFT_CALF   ("left_calf.jvg"),
  LEFT_ELBOW  ("left_elbow.jvg"),
  LEFT_KNEE   ("left_knee.jvg"),
  LEFT_SHOE   ("left_shoe.jvg"),
  LEFT_THIGH  ("left_thigh.jvg"),
  LEFT_WRIST  ("left_wrist.jvg"),
  RIGHT_ARM   ("right_arm.jvg"),
  RIGHT_CALF  ("right_calf.jvg"),
  RIGHT_KNEE  ("right_knee.jvg"),
  RIGHT_SHOE  ("right_shoe.jvg"),
  RIGHT_THIGH ("right_thigh.jvg"),
  RIGHT_WRIST ("right_wrist.jvg");

  final String jvg;

  Component(String jvg) {
    this.jvg = jvg;
  }

  public String getJsonString(){
    try (var inputStream = Clancy.class.getResourceAsStream(jvg)){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
