package com.whitewoodcity.xtrikeresources.monsters.orcus;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.monsters.orcus.Action.*;
import static com.whitewoodcity.xtrikeresources.monsters.orcus.Components.*;

public class Orcus {
  public static final List<JVGComponent> SPRITE = List.of(RIGHT_THIGH, RIGHT_LEG, RIGHT_SHOE, RIGHT_HAND, RIGHT_ARM, BODY,LEFT_THIGH, LEFT_LEG, LEFT_SHOE,  LEFT_ARM, HEAD, POLE_AXE, LEFT_PALM,LEFT_HAND,RIGHT_PALM);
  public static final List<JsonFile> SPRITE_ACTIONS = List.of(IDLE,WALK, ATTACK);
}
