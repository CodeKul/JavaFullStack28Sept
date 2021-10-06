package abstraction;

public class Cricket implements Sport {

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
    }

    @Override
    public void play() {
        System.out.println("Playing cricket");
    }
}
