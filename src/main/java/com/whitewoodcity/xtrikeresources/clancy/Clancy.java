package com.whitewoodcity.xtrikeresources.clancy;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.clancy.Action.*;
import static com.whitewoodcity.xtrikeresources.clancy.Components.*;

public class Clancy {
  public static final List<Components> CASUAL_JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW);
  public static final List<Action> CASUAL_ACTIONS              = List.of(IDLE, WALK, RUN, JUMP);

  public static final List<Components> BATTLE_JVG_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<Components> BATTLE_UPPER_BODY     = List.of(RIGHT_ARM, RIGHT_WRIST, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<Action> BATTLE_UPPER_ACTIONS        = List.of(ALERT, SHOOT, FIRE);
  public static final List<Components> BATTLE_LOWER_BODY     = List.of(RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE);
  public static final List<Action> BATTLE_LOWER_ACTIONS        = List.of(IDLE, WALK, RUN, JUMP);
  public static final List<Components> FLAME_JVG_COMPONENTS  = List.of(FLAME0, FLAME1, FLAME2, FLAME3, FLAME4, FLAME5);
  public static final List<Action> FLAME_ACTIONS               = List.of(FLAME);
}
