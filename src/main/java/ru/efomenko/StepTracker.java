package ru.efomenko;

import java.util.Scanner;

public class StepTracker {
    private final static MonthData[] monthData = new MonthData[12];
    private final Scanner scanner;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int j = 0; j < monthData.length; j++) {
            monthData[j] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        System.out.println("Введите номер дня");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (month > 31 || month < 1 || day > 31 || day < 1 || steps < 0) {
            System.out.println("Введены не верные параметры");
            return;
        }
        monthData[month - 1].days[day - 1] = steps;

    }
}
