package test27oct;

import java.util.Scanner;

public class FirstP {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thus");
                break;
            default:
                System.out.println("No day");
        }
    }
}
