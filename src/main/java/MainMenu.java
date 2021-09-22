import java.util.Scanner;

public class MainMenu {

    public static void displayMainMenu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nEnter 1 to see today's date\n" +
                "Enter 2 to calculate the factorial of a number\n" +
                "Enter 3 to sort an array\n" +
                "Enter 4 to reverse an Integer\n" +
                "Enter 0 to exit the program");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            TodaysDate.seeTodaysDate();
            MainMenu.displayMainMenu();
        } else if (choice.equals("2")) {
            Factorial.factorialEngine();
            MainMenu.displayMainMenu();
        } else if (choice.equals("3")) {
            SortArray.sortArray();
            MainMenu.displayMainMenu();
        } else if (choice.equals("4")) {
            IntegerReversal.reverse();
            MainMenu.displayMainMenu();
        }
        else if (choice.equals("0")) {
            System.out.print("\nShutting down ");
            for (int i =0; i < 10; i++) {
                Thread.sleep(300);
                System.out.print(".");
            }
            return;
        }
        else {
            System.out.println("Hey - '" + choice + "' wasn't one of the options. Pick again!");
            MainMenu.displayMainMenu();
        }

        scanner.close();
    }
}
