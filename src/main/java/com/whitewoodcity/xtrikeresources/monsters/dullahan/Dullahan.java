package com.whitewoodcity.xtrikeresources.monsters.dullahan;

import io.javafx.whitewoodcity.JVGComponent;
import io.javafx.whitewoodcity.JsonFile;

import java.util.List;

import static com.whitewoodcity.xtrikeresources.monsters.dullahan.Animation.*;
import static com.whitewoodcity.xtrikeresources.monsters.dullahan.Components.*;

public class Dullahan {
  public static final List<JVGComponent> SPRITE = List.of(INNER_HINDHOOF,INNER_FOREHOOF,INNER_VAMBRACE,BREASTPLATE,TAIL,INNER_HINDFETLOCK,INNER_HINDTHIGH,INNER_HINDCANNON,INNER_FORETHIGH,INNER_FOREFETLOCK,INNER_FORECANNON,OUTER_FOREHOOF,OUTER_HINDHOOF,OUTER_HINDFETLOCK,OUTER_HINDCANNON,OUTER_HINDTHIGH,OUTER_FOREFETLOCK,OUTER_FORECANNON,OUTER_FORETHIGH,FLANCHARD,TASSETS,REREBRACE,MANE,CUISSARD,SHAFT,SHAFFRON,GREAVE,SABATON,VAMBRACE,SPEARHEAD);
  public static final List<JsonFile> SPRITE_ANIMATION = List.of(IDLE, THRUST);
}
