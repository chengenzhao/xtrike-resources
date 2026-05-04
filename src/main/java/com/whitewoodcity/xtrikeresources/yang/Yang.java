package com.whitewoodcity.xtrikeresources.yang;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.yang.Action.IDLE;
import static com.whitewoodcity.xtrikeresources.yang.JVGComponent.*;

public class Yang {
  public static final List<JVGComponent> CASUAL_JVG_COMPONENTS = List.of(RIGHT_HAND,RIGHT_ARM,RIGHT_THIGH,RIGHT_CALF, RIGHT_SHOE,LEFT_THIGH,LEFT_CALF,LEFT_SHOE,RIGHT_SHOULDER,HEAD_TIE,LEFT_BODY,RIGHT_BODY,AIGUILLETTE,LEFT_HAND,LEFT_ARM,EPAULETTES);
  public static final List<Action> CASUAL_ACTIONS              = List.of(IDLE);
}
