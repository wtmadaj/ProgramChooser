import java.util.Scanner;

public class IntegerReversal {
    public static void reverse() {

        System.out.println("Enter a number and I'll reverse it: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        StringBuilder y = new StringBuilder(String.valueOf(x));
        y.reverse();
        String z = y.toString();
        int a = Integer.parseInt(z);

        System.out.println(a);

//        TODO:
//          -Add exception handling for numbers smaller than -2^31 and larger than 2^31-1
//          -Add error messaging for when the above occurs
    }
}
