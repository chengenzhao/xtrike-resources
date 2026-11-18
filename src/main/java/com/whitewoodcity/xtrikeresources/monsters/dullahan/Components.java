package com.whitewoodcity.xtrikeresources.monsters.dullahan;

import com.whitewoodcity.xtrikeresources.JVGComponent;

public enum Components implements JVGComponent {
  SPEARHEAD("spearhead.jvg",3),
  VAMBRACE("vambrace.jvg",2),
  SABATON("sabaton.jvg",3),
  GREAVE("greave.jvg",2),
  SHAFFRON("shaffron.jvg",1),
  MANE("mane.jvg",1),
  SHAFT("shaft.jvg",3),
  CUISSARD("cuissard.jvg",1),
  REREBRACE("rerebrace.jvg",1),
  TASSETS("tassets.jvg",1),
  FLANCHARD("flanchard.jvg",1),
  OUTER_FORETHIGH("outer_forethigh.jvg",1),
  OUTER_FORECANNON("outer_forecannon.jvg",2),
  OUTER_FOREFETLOCK("outer_forefetlock.jvg",3),
  OUTER_HINDTHIGH("outer_hindthigh.jvg",1),
  OUTER_HINDCANNON("outer_hindcannon.jvg",2),
  OUTER_HINDFETLOCK("outer_hindfetlock.jvg",3),
  OUTER_HINDHOOF("outer_hindhoof.jvg",4),
  OUTER_FOREHOOF("outer_forehoof.jvg",4),
  INNER_FORECANNON("inner_forecannon.jvg",2),
  INNER_FOREFETLOCK("inner_forefetlock.jvg",3),
  INNER_FORETHIGH("inner_forethigh.jvg",1),
  INNER_HINDCANNON("inner_hindcannon.jvg",2),
  INNER_HINDTHIGH("inner_hindthigh.jvg",1),
  INNER_HINDFETLOCK("inner_hindfetlock.jvg",3),
  TAIL("tail.jvg",1),
  BREASTPLATE("breastplate.jvg",1),
  INNER_VAMBRACE("inner_vambrace.jvg",1),
  INNER_FOREHOOF("inner_forehoof.jvg",4),
  INNER_HINDHOOF("inner_hindhoof.jvg",4),
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
