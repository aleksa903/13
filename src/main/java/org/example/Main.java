package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello АЛЕКСА!");
        Tester t = new Tester("Алекса", "Счеснович", 1, 1, 1000);
        System.out.printf(t.name + " - " + t.surname + " - " + t.experienceInYears + " - " + t.englishLevel + " - " + t.salary);
    }
}