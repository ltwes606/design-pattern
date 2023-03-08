package strategypattern.actionadventuregame.weapon;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("칼을 휘두릅니다.");
    }
}
