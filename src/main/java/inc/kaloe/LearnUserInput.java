package inc.kaloe;

import java.util.Scanner;

public class LearnUserInput {

    public static void sum10InputNumbers () {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        for (int i=1; i<=5; i++){
            System.out.println("Enter number #" + i + ": ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                sum += input;
            } else {
                System.out.println("Invalid Input");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of input numbers are: " + sum);
        scanner.close();
    }

    public static void minAndMax () {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        while (true) {

            System.out.println("Please Enter the Number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {

                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    max = min = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid Input.");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max number is: " + max + ". Min number is: " + min + ".");
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int count = 0;

        while (true){
            System.out.println("Please enter a number: ");

            if (scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
                average = (int) Math.round(sum / count);

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }


}
