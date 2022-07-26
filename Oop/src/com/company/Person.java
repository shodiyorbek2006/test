package com.company;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public Person(int year) {
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person() {

    }


    public void getCar() {
        System.out.println(year);
    }

    public void show() {
        System.out.println(name);
        System.out.println(year);
    }


}
