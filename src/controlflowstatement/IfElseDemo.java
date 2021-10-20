package controlflowstatement;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
//        int age;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ENter the age");
//        age = scanner.nextInt();
//
//        if (age >= 18) {//simple/single level if else
//            System.out.println("You can vote");
//        } else if (age <= 18) {
//            System.out.println("You can not vote");
//        }

        int a = 10, b = 20, c = 30;

        if (a > b && a > c) {//ladder if
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }


    }
}
