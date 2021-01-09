package JavaCore.level9.lecture3.task4ИЕщеОдинАдаптер;

import java.io.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("res/f.txt"));
        PersonScanner ad = new PersonScannerAdapter(scanner);
        while (scanner.hasNext()) {
            System.out.println(ad.read());
        }
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String[] person = fileScanner.nextLine().split(" ");
            String lastName = person[1];
            String firstName = person[2];
            String middleName = person[0];
            Date date = null;
            try {
                date = sdf.parse(Integer.parseInt(person[3]) + " "
                        + Integer.parseInt(person[4]) + " "
                        + Integer.parseInt(person[5]));
            } catch (ParseException p) {
                p.printStackTrace();
            }

            return new Person(lastName, firstName, middleName, date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
