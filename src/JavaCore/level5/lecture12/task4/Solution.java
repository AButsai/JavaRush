package JavaCore.level5.lecture12.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(thePlanet);

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static
    {

        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
       if (Planet.SUN.equals(s)) {
           thePlanet = Sun.getInstance();
       } else if (Planet.MOON.equals(s)) {
           thePlanet = Moon.getInstance();
       } else if (Planet.EARTH.equals(s)) {
           thePlanet = Earth.getInstance();
       } else {
           thePlanet = null;
       }
    }
}
