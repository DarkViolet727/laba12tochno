package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(String prefix, boolean showSalary) {
        System.out.println(prefix + " Name: " + name + ", Surname: " + surname +
                (showSalary ? ", Salary: " + salary : ""));
    }

    public static void printTesterInfo(Tester tester) {
        System.out.println("Tester Info: " + tester.name + "f " + tester.surname);
    }
}
