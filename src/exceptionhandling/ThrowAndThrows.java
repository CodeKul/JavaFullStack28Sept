package exceptionhandling;

public class ThrowAndThrows {
    public static void main(String[] args)throws Exception {

        int age= 17;

        if(age<=18){
            throw new Exception("You can't vote");
        }else {
            System.out.println("You can vote");
        }

        System.out.println("Hiii");
    }
}

/**
                       throw                                 Throws
 *
 * 1 .Throw is used to throw exception            1. Throws is used to declare exception
 *
 * 2. Throw is used in method                     2. Throws is used  with method signature
 *
 * 3. you can throw only one exception at time    3. You can declare multiple exception
 *
 * 4. Throw is followed by instance               4. Throws is followed by class
 *
 */

