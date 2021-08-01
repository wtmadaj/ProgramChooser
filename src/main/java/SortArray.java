import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    static void sortArray() {

        int inputArray[] = collectInput();

        Arrays.sort(inputArray);

        System.out.println("\nYour array is now sorted: ");
        for (int number : inputArray) {
            System.out.print(number + "  ");
        }
    }

    static int[] collectInput() {
        Scanner scanner = new Scanner(System.in);
        int integerCount;

        System.out.println("Enter the number of integers you would like to input to be sorted: \n");
        integerCount = scanner.nextInt();
        int inputArray[] = new int[integerCount];

        System.out.println("\nEnter the elements of the array, separated by a space: \n");
        for (int i = 0; i < integerCount; i++){
            inputArray[i] = scanner.nextInt();
            System.out.print(inputArray[i] + " ");
        }

        return inputArray;
    }
}