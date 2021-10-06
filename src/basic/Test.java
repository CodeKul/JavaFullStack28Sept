package basic;

public class Test {

    int i = 90;
    int j;


    public static void main(String[] args) {

        Test obj = new Test();
        obj.j=90;
        obj.show();
        obj.show();
    }

    public void show() {
        System.out.println("In show" + i);
    }


}
