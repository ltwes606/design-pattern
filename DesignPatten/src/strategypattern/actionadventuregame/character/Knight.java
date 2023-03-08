package strategypattern.actionadventuregame.character;

import strategypattern.actionadventuregame.weapon.KnifeBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }
}
