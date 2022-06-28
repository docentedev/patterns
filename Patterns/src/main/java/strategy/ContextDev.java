package strategy;

import strategy.strategies.IDev;

public class ContextDev {
    final private IDev dev;
    public ContextDev(IDev dev) {
        this.dev = dev;
    }

    public void run () {
        this.dev.toWork();
    }
}
