import java.util.Scanner;

public class IntegerReversal {
    public static void reverse() {

        System.out.println("Enter a number and I'll reverse it: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sign;
        if (x<0) {
            sign = -1;
        } else { sign = 1; }

        StringBuilder y = new StringBuilder(String.valueOf(x));
        y.reverse();
        String z = y.toString();
        if (z.endsWith("-")) {
            z = z.substring(0, z.length()-1);
        }
        int a = Integer.parseInt(z);

        System.out.println(a*sign);

//        TODO:
//          -Add exception handling for numbers smaller than -2^31 and larger than 2^31-1
//          -Add error messaging for when the above occurs
    }
}
