package chapters.chapter_12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Q_32 {
    public static void main(String[] args) {

        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();

        System.out.println(printHeader());

        for (int year = 2010; year >= 2001; year--){
            try {
                java.net.URL url = new java.net.URL(getURL(year));
                Scanner input = new Scanner(url.openStream());
                for (int i = 0; i < 5 && input.hasNext(); i++){
                    lines = readURL(input,lines);
                    boys.add(lines.get(1));
                    girls.add(lines.get(3));
                }
            } catch (java.net.MalformedURLException ex){
                System.out.println("Invalid URL");
            } catch (java.io.IOException ex) {
                System.out.println("I/O Errors: no such file");
            }
            System.out.println(printTable(year,boys,girls));

            boys.clear();
            girls.clear();
        }
    }

    public static String printHeader(){
        String header = "";
        for (int i = 0; i < 50; i++) {
            header += "-";
        }
        header += "\nYear\t";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                header += "Rank " + (j+1) + "\t";
            }
        }
        header += "\n";
        for (int i = 0; i < 50; i++) {
            header += "-";
        }
        return header;
    }

    public static String printTable(int year, ArrayList<String> boy, ArrayList<String> girl){
        String table = "";
        table = String.format("%5d ", year);
        for (int i = 0; i < 5; i++) {
            table += girl.get(i) + "\t";
        }
        for (int i = 0; i < 5; i++) {
            table += boy.get(i) + "\t";
        }
        table += "\n";
        return table;
    }

    public static ArrayList<String> readURL(Scanner input, ArrayList<String> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i, input.next());
        }
        return list;
    }

    public static String getURL(int year) {
        return "http://www.cs.armstrong.edu/liang/data/babynamesranking" +
                year + ".txt";
    }
}
