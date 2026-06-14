package com.whitewoodcity.xtrikeresources.monsters.bones;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.monsters.bones.Components.*;
import static com.whitewoodcity.xtrikeresources.yang.Action.*;

public class Bones {
  public static final List<JVGComponent> JVG_COMPONENTS = List.of(RIGHT_THIGH,RIGHT_ARM, LEFT_THIGH, BODY,RIGHT_FOOT, LEFT_FOOT, BLADE, LEFT_SHOULDER, LEFT_HAND, LEFT_ARM, HEAD);
  public static final List<JsonFile> ACTIONS              = List.of(IDLE);
}
