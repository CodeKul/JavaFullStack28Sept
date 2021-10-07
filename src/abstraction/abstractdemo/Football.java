package abstraction.abstractdemo;

public class Football extends AbsSport {
    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
//        obj.exercise();
    }

    @Override
    void play() {
        System.out.println("Playing football");
    }

    @Override
    public void play1() {
        System.out.println("Play1 ");
    }
}


/**
 *          abstract class                                                Interface
 *
 * 1.we declare abstract class using abstract keyword           1. interface keyword  is used
 *
 * 2.we extends abstract class to another class                 2. implements
 *
 * 3.we have concrete  and abstract methods in abstract class   3. we have only abstract methods
 *
 * 4.public ,protected,private access modifier are allowed      4. Only public is allowed
 *
 * 5.partial abstraction                                        5.  100%  abstraction
 */