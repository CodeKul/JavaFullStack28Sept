package controlflowstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        int num1, num2;
        char op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Enter  operation");
        op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
            default:
                System.out.println("No operation");
        }
    }
}
