package com.whitewoodcity.xtrikeresources.aarod;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.aarod.Action.IDLE;
import static com.whitewoodcity.xtrikeresources.aarod.JVGComponent.*;

public class Aarod {
  public static final List<JVGComponent> JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_HAND, RIGHT_THIGH, RIGHT_CALF, RIGHT_FOOT, LEFT_THIGH, LEFT_CALF, LEFT_FOOT, LEFT_ARM, LEFT_HAND, RIGHT_SHOULDER, BODY, LEFT_SHOULDER, HEAD);
  public static final List<Action> ACTIONS = List.of(IDLE);
}
