package inc.kaloe;

import java.util.Scanner;

public class ReverseArray {
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

    public static void reverse (int[] intArray) {
        System.out.println("Array is: \r");
        int[] anotherArray = new int[intArray.length];
        for(int i=0; i<intArray.length; i++) {
            anotherArray[i] = intArray[i];
            System.out.println(anotherArray[i]);
        }

        System.out.println("Reversed array is: \r");
        for (int i=intArray.length; i>0; i--){
            intArray[intArray.length-i] = anotherArray[i-1];
            System.out.println(anotherArray[i-1]);
        }
    }
}
