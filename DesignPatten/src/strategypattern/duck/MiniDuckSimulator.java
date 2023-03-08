package strategypattern.duck;

import strategypattern.duck.Quack.MuteQuack;
import strategypattern.duck.fly.FlyWithWings;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("--------------------------------------");
        Duck model = new ModelDuck(new FlyWithWings(), new MuteQuack());
        model.performFly();
        model.performQuack();

        System.out.println("--------------------------------------");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
