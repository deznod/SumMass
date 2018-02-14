package ru.dve.cat;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Имя: ");
            String name = sc.nextLine();
            System.out.println("Пол(0-Ж,1-М): ");
            byte gen = sc.nextByte();
            char gender = 'Ж';
            if (gen == 1) {
                gender = 'М';
            }
            String year = String.valueOf((int) (Math.random() * (2018 - 2000)) + 2000);
            System.out.println("Порода: ");
            String bread = sc.nextLine();
            cats[i] = new Cat(name, gender, year, bread);
        }

        System.out.println(searchOldCat(cats));

    }

    private static Cat searchOldCat(Cat[] cats) {
        int save = 10;
        int a = Integer.valueOf(cats[0].getYear());
        for (int i = 0; i < cats.length; i++) {
            int b = Integer.valueOf(cats[i].getYear());
            if (cats[i].getGender() == 'М' && a >= b) {
                a = Integer.valueOf(cats[i].getYear());
                save = i;
            }
        }
        return cats[save];
    }
}
