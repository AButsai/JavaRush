package level8.lecture8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task4 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("JAN 1 2012"));
        map.put("Сталло", dateFormat.parse("FEB 1 2012"));
        map.put("Сталл", dateFormat.parse("MAR 1 2012"));
        map.put("Стал", dateFormat.parse("APR 1 2012"));
        map.put("Ста", dateFormat.parse("DEC 1 2012"));
        map.put("Ст", dateFormat.parse("NOV 1 2012"));
        map.put("С", dateFormat.parse("AUG 1 2012"));
        map.put("S", dateFormat.parse("JAN 1 2012"));
        map.put("CC", dateFormat.parse("JUL 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Date value = iterator.next().getValue();
            if(value.getMonth() > 4 && value.getMonth() < 8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
