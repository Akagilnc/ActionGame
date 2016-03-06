package com.deronlee.test.character;

import com.deronlee.test.weapon.AxeBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public class Knight extends Character {
    public Knight() {
        weaponBehavior = new AxeBehavior();
    }
}
