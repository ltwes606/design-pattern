package strategypattern.actionadventuregame.character;

import strategypattern.actionadventuregame.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
