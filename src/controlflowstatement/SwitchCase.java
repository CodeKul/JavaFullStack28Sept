package controlflowstatement;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        i = scanner.nextInt();
        switch (i) {
            case 1:
                int j = 0;
                System.out.println("Enter  number");
                j = scanner.nextInt();
                switch (j) {
                    case 10:
                        System.out.println(10);
                        break;
                    case 20:
                        System.out.println(20);
                        break;
                    default:
                        System.out.println("Not matched");
                }
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("Default");
        }

    }
}
