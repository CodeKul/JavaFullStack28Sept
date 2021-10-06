package package1;

public class Test1 {

    protected int i =90;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }

}

/**
 *
 * private => you can access private variable/method in only within class
 *  * default => it is only accessible in package.
 *  * protected => access in same package and through inheritance outside the package.
 *  * public => you can access public variable/method in whole project
 */
