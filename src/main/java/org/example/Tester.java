package org.example;

public class Tester {
     String name;
     int experienceInYears;
      int englishLevel;

     String surname;
      double salary;

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears, int englishLevel) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
    }
    public Tester(String name, String surname, int experienceInYears, int englishLevel, double salary) {
        this(name, surname, experienceInYears, englishLevel);
        this.salary = salary;
    }
    public void sayHello(String name) {
        System.out.println("Добрый вечер, " + name + "!");
    }

    public void sayHello(String name, String surname) {
        System.out.println("Добрый день, " + name + " и " + surname + "!");
    }
    public void sayHello(String name, String surname,double salary) {
        System.out.println("Добрый день, " + name + " и " + surname + "!"+ salary);
    }
    public static void printHelloWorld() {
        System.out.println("Hello, Алекса");
    }
}