package level8.lecture11;

import java.util.Calendar;
import java.util.Date;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        date1.setDate(1);
        date1.setMonth(Calendar.JANUARY);

        Date current = new Date(date);
        long ms = current.getTime() - date1.getTime();
        long msD = (24 * 60 * 60 * 1000);

        int count = (int) (ms / msD);

        boolean result;
        if (count % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
