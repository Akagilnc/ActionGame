package com.deronlee.test.character;

import com.deronlee.test.weapon.WeaponBehavior;

/**
 * Created by lnc on 3/6/2016.
 */
public abstract class  Character {
    WeaponBehavior weaponBehavior;

        public void fight() {
            weaponBehavior.useWeapon();
        }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}



