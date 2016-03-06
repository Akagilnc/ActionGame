package com.deronlee.test.character;

import com.deronlee.test.weapon.BowAndArrowBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
