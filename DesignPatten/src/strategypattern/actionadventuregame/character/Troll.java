package strategypattern.actionadventuregame.character;

import strategypattern.actionadventuregame.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
