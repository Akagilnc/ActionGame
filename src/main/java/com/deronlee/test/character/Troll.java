package com.deronlee.test.character;

import com.deronlee.test.weapon.KnifeBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public class Troll extends Character {
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
}
