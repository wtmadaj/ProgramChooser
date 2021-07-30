import java.util.Scanner;

public class MainMenu {

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter 1 to see today's date\n" +
                "Enter 2 to calculate the factorial of a number\n" +
                "Enter 3 to do something else\n" +
                "Enter 0 to exit the program");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            TodaysDate.seeTodaysDate();
            MainMenu.displayMainMenu();
        } else if (choice.equals("2")) {
            Factorial.factorialEngine();
            MainMenu.displayMainMenu();
        }
        else if (choice.equals("0")) {
            return;
        }
        else {
            System.out.println("Hey - '" + choice + "' wasn't one of the options. Pick again!");
            MainMenu.displayMainMenu();
        }

        scanner.close();
    }
}
