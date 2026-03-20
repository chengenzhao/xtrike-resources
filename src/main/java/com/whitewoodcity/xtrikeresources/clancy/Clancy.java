package com.whitewoodcity.xtrikeresources.clancy;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.clancy.Action.*;
import static com.whitewoodcity.xtrikeresources.clancy.Component.*;

public class Clancy {
  /**
   * Replaced by CASUAL_COMPONENTS
   */
  @Deprecated(since = "0.5", forRemoval = true)
  public static final List<Component> ORDERED_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW);
  /**
   * Replaced by CASUAL_ACTIONS
   */
  @Deprecated(since = "0.5.1", forRemoval = true)
  public static final List<Action> ACTIONS = List.of(IDLE, WALK, RUN, JUMP);

  public static final List<Component> CASUAL_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW);
  public static final List<Action> CASUAL_ACTIONS = List.of(IDLE, WALK, RUN, JUMP);

  public static final List<Component> BATTLE_COMPONENTS = List.of(RIGHT_ARM, RIGHT_WRIST, RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<Component> BATTLE_UPPER_BODY = List.of(RIGHT_ARM, RIGHT_WRIST, BODY_BACK, HEAD, BODY_FRONT, SCARL, LEFT_ARM, LEFT_WRIST, LEFT_ELBOW, RIGHT_PALM);
  public static final List<Action> BATTLE_UPPER_ACTIONS = List.of(ALERT, SHOOT, FIRE);
  public static final List<Component> BATTLE_LOWER_BODY = List.of(RIGHT_CALF, RIGHT_SHOE, RIGHT_THIGH, RIGHT_KNEE, LEFT_CALF, LEFT_SHOE, LEFT_THIGH, LEFT_KNEE);
  public static final List<Action> BATTLE_LOWER_ACTIONS = List.of(IDLE, WALK, RUN, JUMP);
}
