package com.deronlee.test.weapon;

/**
 * Created by lnc on 3/6/2016.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("用匕首刺杀");
    }
}
