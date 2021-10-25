package controlflowstatement;

import java.util.Scanner;

public class SumProgram {

    public static void main(String[] args) {

        int num, sum = 0;
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the value");
            num = scanner.nextInt();
            sum = num + sum;

            System.out.println("Do you want to continue");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println(sum);
    }
}
