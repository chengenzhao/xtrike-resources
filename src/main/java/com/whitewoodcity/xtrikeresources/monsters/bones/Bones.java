package com.whitewoodcity.xtrikeresources.monsters.bones;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.monsters.bones.Action.*;
import static com.whitewoodcity.xtrikeresources.monsters.bones.Components.*;

public class Bones {
  public static final List<JVGComponent> SPRITE = List.of(RIGHT_ARM,BLADE,RIGHT_THIGH, RIGHT_FOOT,LEFT_THIGH, BODY, LEFT_FOOT,  LEFT_SHOULDER, LEFT_HAND, LEFT_ARM, HEAD);
  public static final List<JsonFile> SPRITE_ANIMATION = List.of(IDLE,WALK, ATTACK);
}
