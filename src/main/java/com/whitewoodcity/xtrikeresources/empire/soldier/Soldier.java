package com.whitewoodcity.xtrikeresources.empire.soldier;

import com.whitewoodcity.xtrikeresources.JVGComponent;
import com.whitewoodcity.xtrikeresources.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.empire.soldier.Components.*;
import static com.whitewoodcity.xtrikeresources.empire.soldier.Action.*;

public class Soldier {
    public static final List<JVGComponent> SPRITE = List.of(RIGHT_SHOE,RIGHT_CALF,RIGHT_THIGH,RIGHT_ARM,RIGHT_SHOULDER,CROTCH,LEFT_CALF,LEFT_SHOE,LEFT_THIGH,BODY,HEAD,GUN,RIGHT_HAND,LEFT_ARM,LEFT_SHOULDER);
    public static final List<JsonFile> SPRITE_ANIMATION = List.of(IDLE, WALK, SHOOT, THRUST);
}
