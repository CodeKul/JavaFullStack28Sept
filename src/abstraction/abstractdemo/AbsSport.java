package abstraction.abstractdemo;

import abstraction.interfacedemo.Sport1;

public abstract class AbsSport {

    abstract void play();//abstract methods

    void exercise() {//concrete method
        System.out.println("Exercise...");
    }
}
