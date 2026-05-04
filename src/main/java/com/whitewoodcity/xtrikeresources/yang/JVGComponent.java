package com.whitewoodcity.xtrikeresources.yang;

import com.whitewoodcity.xtrikeresources.clancy.JsonFile;

public enum JVGComponent implements JsonFile {
  EPAULETTES        ("epaulettes.jvg", 1),
  LEFT_ARM          ("left_arm.jvg", 1),
  LEFT_HAND         ("left_hand.jvg", 2),
  AIGUILLETTE       ("aiguillette.jvg",1),
  RIGHT_BODY        ("right_body.jvg",1),
  LEFT_BODY         ("left_body.jvg",1),
  HEAD_TIE          ("head_tie.jvg",1),
  RIGHT_SHOULDER    ("right_shoulder.jvg",1),
  LEFT_SHOE         ("left_shoe.jvg",3),
  LEFT_CALF         ("left_calf.jvg",2),
  LEFT_THIGH        ("left_thigh.jvg",1),
  RIGHT_SHOE        ("right_shoe.jvg",3),
  RIGHT_CALF        ("right_calf.jvg",2),
  RIGHT_THIGH       ("right_thigh.jvg",1),
  RIGHT_ARM         ("right_arm.jvg",1),
  RIGHT_HAND        ("right_hand.jvg",2),

  ;
  final String jvg;
  final int rotateNum;

  JVGComponent(String jvg, int rotateNum) {
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
