package com.whitewoodcity.xtrikeresources.empire.kaelzor;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.empire.kaelzor.Animation.*;
import static com.whitewoodcity.xtrikeresources.empire.kaelzor.Components.*;

public class Kaelzor {
  public static final List<JVGComponent> SPRITE = List.of(ROBE_TAIL,RIGHT_LEG,RIGHT_SHOE,RIGHT_HAND,RIGHT_THIGH,RIGHT_KNEE,RIGHT_ARM,BODY,HEAD,ROBE_FRONT,LEFT_THIGH,LEFT_LEG,LEFT_KNEE,LEFT_SHOE,ROBE_TAIL_LEFT_BACK,LEFT_HAND,LEFT_SHOULD_BACK,LEFT_ARM,LEFT_SHOULDER);
  public static final List<JsonFile> SPRITE_ANIMATION = List.of(IDLE);
}
