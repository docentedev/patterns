package strategy;

import strategy.strategies.IDev;
import strategy.strategies.Junior;
import strategy.strategies.SemiSenior;

public class StrategyApp {
    public static void main(String[] args) {
        System.out.println("Start App");
        IDev senior = new SemiSenior();
        ContextDev context = new ContextDev(senior);
        context.run();

        IDev junior = new Junior();
        ContextDev context2 = new ContextDev(junior);
        context2.run();
    }
}
