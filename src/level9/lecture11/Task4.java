package level9.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task4 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newSimpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date1 = simpleDateFormat.parse(date);
        String result = newSimpleDateFormat.format(date1);
        System.out.println(result.toUpperCase());

    }
}
