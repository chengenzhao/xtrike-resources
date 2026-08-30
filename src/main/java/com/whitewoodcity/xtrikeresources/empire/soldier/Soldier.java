package com.whitewoodcity.xtrikeresources.empire.soldier;

import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.empire.soldier.Components.*;
import static com.whitewoodcity.xtrikeresources.empire.soldier.Action.*;

public class Soldier {
  public static final List<Components> COMPONENTS       = List.of(RIGHT_SHOE,RIGHT_CALF,RIGHT_THIGH,RIGHT_ARM,BODY,LEFT_CALF,LEFT_SHOE,LEFT_THIGH,GUN,RIGHT_HAND,LEFT_ARM,HEAD,LEFT_SHOULDER);
  public static final List<JsonFile> ACTIONS            = List.of(IDLE);
}
