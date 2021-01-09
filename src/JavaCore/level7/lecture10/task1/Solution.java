package JavaCore.level7.lecture10.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        switch (args[0]) {
            case "-c":
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date date = format.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], date));
                } else {
                    allPeople.add(Person.createFemale(args[1], date));
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                if (args[3].equals("м")) {
                    person.setSex(Sex.MALE);
                } else {
                    person.setSex(Sex.FEMALE);
                }
//                int idU = Integer.parseInt(args[1]);
//                SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//                Date date1 = format1.parse(args[3]);
//                for (int i = 0; i < allPeople.size(); i++) {
//                    if (i == idU) {
//                        allPeople.get(i).setName(args[2]);
//                        allPeople.get(i).setBirthDate(date1);
//                        if (args[2].equals("м")) {
//                            allPeople.get(i).setSex(Sex.MALE);
//                        } else {
//                            allPeople.get(i).setSex(Sex.FEMALE);
//                        }
//                    }
//                }
                break;
            case "-d":
                int idD = Integer.parseInt(args[1]);
                for (int i = 0; i < allPeople.size(); i++) {
                    if (i == idD) {
                        allPeople.get(i).setName(null);
                        allPeople.get(i).setSex(null);
                        allPeople.get(i).setBirthDate(null);
                    }
                }
                break;
            case "-i":
                SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                int idI = Integer.parseInt(args[1]);
                String sex;
                for (int i = 0; i < allPeople.size(); i++) {
                    if (i == idI) {
                        if (allPeople.get(i).getSex().equals(Sex.MALE)) {
                            sex = "м";
                        } else {
                            sex = "ж";
                        }
                        System.out.println(allPeople.get(i).getName() + " " + sex + " " + format2.format(allPeople.get(i).getBirthDate()));
                    }
                }
                break;
        }
    }
}
