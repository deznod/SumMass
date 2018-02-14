package ru.haleluja.TextFiles;
import java.io.*;
/**
 * Created by g15oit18 on 21.06.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String string;
        String[] array = new String[100];
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\End.txt"));
        while ((string = bufferedReader.readLine()) != null) {
            string = bufferedReader.readLine();
            array = string.split(" ");
            start(array, bufferedReader,bufferedWriter);
        }


    }
    public static void start(String[] array, BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        int ask;
        int a;
        int b;
        switch (array[1]){
            case "+":
               ask = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
                System.out.println(ask);
                bufferedWriter.write(ask + "\n");
                break;
            case "-":
                ask = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
                System.out.println(ask);
                bufferedWriter.write(ask + "\n");
                break;
            case "*":
                ask = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
                System.out.println(ask);
                bufferedWriter.write(String.valueOf(ask + "\n"));
                break;
            case "/":
                ask = Integer.parseInt(array[0]) / Integer.parseInt(array[2]);
                System.out.println(ask);
                bufferedWriter.write(ask + "\n");
                break;
        }
    }
}
