package strategypattern.duck;

import strategypattern.duck.Duck;
import strategypattern.duck.Quack.QuackBehavior;
import strategypattern.duck.fly.FlyBehavior;

public class ModelDuck extends Duck {

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
