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
        System.out.println("\nFactorial " + originalUserEntry + " is: " + factorial);
    }
}
/*
TODO:
    1) print the factorial process so the user can see it
*/
