package com.whitewoodcity.xtrikeresources.clancy;

import java.util.ArrayList;
import java.util.List;

public class Clancy {
  public static final String HEAD = "head.jvg";
  public static final String BODY_BACK = "body_back.jvg";
  public static final String BODY_FRONT = "body_front.jvg";

  public static final String LEFT_ARM = "left_arm.jvg";
  public static final String LEFT_CALF = "left_calf.jvg";
  public static final String LEFT_ELBOW = "left_elbow.jvg";
  public static final String LEFT_KNEE = "left_knee.jvg";
  public static final String LEFT_SHOE = "left_shoe.jvg";
  public static final String LEFT_THIGH = "left_thigh.jvg";
  public static final String LEFT_WRIST = "left_wrist.jvg";

  public static final String RIGHT_ARM = "right_arm.jvg";
  public static final String RIGHT_CALF = "right_calf.jvg";
  public static final String RIGHT_KNEE = "right_knee.jvg";
  public static final String RIGHT_SHOE = "right_shoe.jvg";
  public static final String RIGHT_THIGH = "right_thigh.jvg";
  public static final String RIGHT_WRIST = "right_wrist.jvg";

  public static final List<String> components = new ArrayList<>();

  static {
    components.add(RIGHT_ARM);
    components.add(RIGHT_WRIST);
    components.add(RIGHT_CALF);
    components.add(RIGHT_SHOE);
    components.add(RIGHT_THIGH);
    components.add(RIGHT_KNEE);
    components.add(LEFT_CALF);
    components.add(LEFT_SHOE);
    components.add(LEFT_THIGH);
    components.add(LEFT_KNEE);
    components.add(BODY_BACK);
    components.add(HEAD);
    components.add(BODY_FRONT);
    components.add(LEFT_ARM);
    components.add(LEFT_WRIST);
    components.add(LEFT_ELBOW);
  }
}
