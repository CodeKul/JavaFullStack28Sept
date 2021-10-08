package abstraction.interfacedemo;

public class Cricket implements Sport,Sport1{

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
    }

    @Override
    public void play() {
        System.out.println("In play");
    }

}
