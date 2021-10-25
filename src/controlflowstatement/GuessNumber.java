package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int num, guessNumber, counter = 0;
        Scanner scanner = new Scanner(System.in);
        num = (int) (Math.random() * 100) + 1;
        do {
            System.out.println("Enter the value");
            guessNumber = scanner.nextInt();
            counter++;
            if (num > guessNumber) {
                System.out.println("Number is greater");
            } else if (num < guessNumber) {
                System.out.println("number is  less");
            } else {
                System.out.println("you guess correct " + counter + " attempt");
            }
        } while (num != guessNumber);
    }
}
