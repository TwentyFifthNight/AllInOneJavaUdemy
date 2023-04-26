import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values:\r");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(values);
        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        int temp;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if(sortedArray[j] < sortedArray[j+1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        //Reverse.reverse(new int[]{1,2,3,4,5});
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array.get(0));
    }
}
