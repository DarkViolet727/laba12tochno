package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Artem", "Ivanov", 5, "Intermediate", 5000.0);

        tester.printInfo();
        tester.printInfo("Detailed:");
        tester.printInfo("Custom:", true);

        Tester.printTesterInfo(tester);
    }
}