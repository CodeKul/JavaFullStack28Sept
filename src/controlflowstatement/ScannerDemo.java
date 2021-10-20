package controlflowstatement;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int age ;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter age value");
        age = scanner.nextInt();

        System.out.println("age is==>"+age);

    }
}
