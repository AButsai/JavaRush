package JavaCore.level9.lecture11.task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        TreeSet<String> setName = new TreeSet<>();

        String fileName = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {

            String[] splitedLine;
            String line;
            Double currentValue;

            while ((line = br.readLine()) != null) {
                splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);

                if (map.containsKey(name)) {
                    currentValue = map.get(name);
                    map.put(name, value + currentValue);
                } else {
                    map.put(name, value);
                }
            }
        } catch (IOException o) {
            /*NON*/
        }

        double maxValue = map.firstEntry().getValue();
        for (double value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (String name : map.keySet()) {
            if (maxValue == map.get(name)) {
                setName.add(name);
            }
        }

        for (String s : setName) {
            System.out.println(s);
        }
    }
}
