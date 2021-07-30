import java.util.Scanner;

public class Factorial {

    static void factorialEngine() {
        int userEntry;
        long factorial = 1;

        System.out.println("Enter a number between 1 and 20 to calculate its factorial: ");
        Scanner in = new Scanner(System.in);
        userEntry = in.nextInt();
        int originalUserEntry = userEntry;

        while (userEntry > 1) {
            factorial *= userEntry--;
        }

//        Catch sneaky zeros or negative numbers
        if (userEntry < 1) {
            System.out.println("I said to enter a number between 1 and 20!\n");
            factorialEngine();
        }
//        Print out how factorial is calculated
        for (int i = originalUserEntry; i > 0 ; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
            if (i == 1) {
                System.out.print(" = " + factorial);
            }
        }

        System.out.println("\nFactorial " + originalUserEntry + " is: " + factorial);
    }
}
