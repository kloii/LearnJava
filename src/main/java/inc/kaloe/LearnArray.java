package inc.kaloe;

import java.util.Scanner;

public class LearnArray {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] sortArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length-1-i; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("myIntArray[" + i + "] is: " + intArray[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static double getAverge(int[] intArray) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        average = sum / intArray.length;
        System.out.println("Average is: " + average);
        return average;
    }

}
