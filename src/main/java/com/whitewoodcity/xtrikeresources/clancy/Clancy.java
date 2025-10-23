package com.whitewoodcity.xtrikeresources.clancy;

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

  public static final List<String> COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW);

  public static String getJsonString(String component){
    try (var inputStream = Clancy.class.getResourceAsStream(component)){
      return new String(inputStream.readAllBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
