import java.text.SimpleDateFormat;
import java.util.Date;

public class TodaysDate {
    static void seeTodaysDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.print("\nToday's date is: " + dateFormat.format(date) + "\n");
    }
}
