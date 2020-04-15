package inc.kaloe;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers (int count) {
        if(count < 2) {
            System.out.println("Invalid count input. Set count = 2 automatically.");
            count = 2;
        }

        System.out.println("Please enter " + count + " integers. \r");
        int[] intArray = new int[count];
        for (int i=0; i<count; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    public static int findMin (int[] intArray) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<intArray.length; i++) {
            int value = intArray[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
