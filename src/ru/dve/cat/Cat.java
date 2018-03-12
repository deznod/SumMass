package ru.dve.cat;

public class Cat {
private String name;
private char gender;
private String year;
private String bread;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", year='" + year + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }

    Cat(String name, char gender, String year, String bread) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.bread = bread;
    }


    public String getYear() {
        return year;
    }


    public char getGender() {
        return gender;
    }

}
