package com.deronlee.test.character;

import com.deronlee.test.weapon.SwordBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
