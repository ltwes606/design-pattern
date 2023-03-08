package strategypattern.actionadventuregame.character;

import strategypattern.actionadventuregame.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
