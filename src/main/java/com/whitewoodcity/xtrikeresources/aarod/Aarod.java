package com.whitewoodcity.xtrikeresources.aarod;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.aarod.Action.IDLE;
import static com.whitewoodcity.xtrikeresources.aarod.Components.*;

public class Aarod {
  public static final List<JVGComponent> JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_HAND, RIGHT_THIGH, RIGHT_CALF, RIGHT_FOOT, LEFT_THIGH, LEFT_CALF, LEFT_FOOT, LEFT_ARM, LEFT_HAND, RIGHT_SHOULDER, BODY, LEFT_SHOULDER, HEAD);
  public static final List<JsonFile> ACTIONS = List.of(IDLE);
}
