package strategypattern.actionadventuregame.character;

import strategypattern.actionadventuregame.weapon.BowAndArrowBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
