package com.whitewoodcity.xtrikeresources.monsters.orcus;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.monsters.orcus.Action.ATTACK;
import static com.whitewoodcity.xtrikeresources.monsters.orcus.Action.IDLE;
import static com.whitewoodcity.xtrikeresources.monsters.orcus.Components.*;


public class Orcus {
  public static final List<JVGComponent> JVG_COMPONENTS = List.of(RIGHT_THIGH, RIGHT_LEG, RIGHT_SHOE, RIGHT_HAND, LEFT_THIGH, LEFT_LEG, LEFT_SHOE, RIGHT_ARM, BODY, LEFT_ARM, HEAD, POLE_AXE, LEFT_PALM,LEFT_HAND,RIGHT_PALM);
  public static final List<JsonFile> ACTIONS            = List.of(IDLE,ATTACK);
}
