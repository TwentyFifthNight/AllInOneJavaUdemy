package MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value:\r");
        return scanner.nextInt();
    }

    public static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values:\r");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if(minElement > array[i])
                minElement = array[i];
        }
        return minElement;
    }
}
