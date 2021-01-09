package JavaCore.level4.lecture8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
            FileReader file = new FileReader("D:\\Папочка\\Учеба\\test3");
        } catch ( Exception q){
            exceptions.add(q);
        }

        try{
            String[] s = new String [2];
            for(int a = 3; a < 4; a++ ){
                String s1 = s[a];
            }
        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            String s = null;
            String s1 = s.toLowerCase();

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(1);

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            int num = Integer.parseInt("QWE");

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            Thread.sleep(-1);

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            Object a = new Integer(0);
            System.out.println((String) a);

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            String[] s = new String[-1];

        }catch ( Exception q){
            exceptions.add(q);
        }

        try {
            String str = "easysteps2buildwebsite";
            System.out.println(str.length());
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
