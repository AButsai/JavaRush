package JavaCore.level9.lecture11.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        String s;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }

        br.close();
        for (String name : list) {
            String[] strName = name.split(" ");
            StringBuffer buf = new StringBuffer();

            for (int i = 0; i < strName.length - 3; i++) {
                buf.append(strName[i]).append(" ");
            }

            int year = Integer.parseInt(strName[strName.length - 1]);
            int month = Integer.parseInt(strName[strName.length - 2]) - 1;
            int day = Integer.parseInt(strName[strName.length - 3]);
            Calendar calendar = new GregorianCalendar(year, month, day);

            PEOPLE.add(new Person(buf.toString().trim(), calendar.getTime()));
        }

        for (Person p : PEOPLE) {
            System.out.println(p.getName() + " " + p.getBirthDate());
        }
    }
}
