package com.whitewoodcity.xtrikeresources.clancy;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.clancy.Action.*;
import static com.whitewoodcity.xtrikeresources.clancy.Components.*;

public class Clancy {
  public static final List<JVGComponent> CASUAL_JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW);
  public static final List<JsonFile> CASUAL_ACTIONS              = List.of(IDLE, WALK, RUN, JUMP);

  public static final List<JVGComponent> BATTLE_JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<JVGComponent> BATTLE_UPPER_BODY     = List.of(RIGHT_ARM, RIGHT_WRIST, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<JsonFile> BATTLE_UPPER_ACTIONS        = List.of(ALERT, SHOOT, FIRE);
  public static final List<JVGComponent> BATTLE_LOWER_BODY     = List.of(RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE);
  public static final List<JsonFile> BATTLE_LOWER_ACTIONS        = List.of(IDLE, WALK, RUN, JUMP);
  public static final List<JVGComponent> FLAME_JVG_COMPONENTS  = List.of(FLAME0, FLAME1, FLAME2, FLAME3, FLAME4, FLAME5);
  public static final List<JsonFile> FLAME_ACTIONS               = List.of(FLAME);
}
