package abstraction.abstractdemo;

import abstraction.interfacedemo.Sport1;

public abstract class AbsSport implements Sport1 {

    abstract void play();//abstract methods

    private void exercise() {//concrete method
        System.out.println("Exercise...");
    }
}
