package strategypattern.actionadventuregame;

import java.util.ArrayList;
import strategypattern.actionadventuregame.character.Character;
import strategypattern.actionadventuregame.character.King;
import strategypattern.actionadventuregame.character.Knight;
import strategypattern.actionadventuregame.character.Queen;
import strategypattern.actionadventuregame.character.Troll;

public class MiniActionAdventureGame {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new King());
        characters.add(new Knight());
        characters.add(new Queen());
        characters.add(new Troll());

        for (Character character : characters) {
            character.fight();
        }
    }
}
