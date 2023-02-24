package ru.efomenko;

import java.util.Scanner;

public class StepTracker {
    private final MonthData[] monthData = new MonthData[12];
    private final Scanner scanner;
    private int goalByStepsPerDay;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        goalByStepsPerDay = 10000;
        initMonthData();
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        System.out.println("Введите номер дня");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (month > monthData.length || month < 1 || day > 31 || day < 1 || steps < 0) {
            System.out.println("Введены не верные параметры");
            return;
        }
        monthData[month - 1].days[day - 1] = steps;
        System.out.println("Данные сохранены");

    }

    public void changeStepGoal() {
        System.out.println("Введите новую цель колличества шагов");
        int newGoal = scanner.nextInt();
        if (newGoal <= 0) {
            System.out.println("Установка такой цели невозможна. Введите положительное число, больше нуля");
            return;
        }
        goalByStepsPerDay = newGoal;
        System.out.println("Цель установлена");
    }

    public void printStatistic() {
        System.out.println("Введите номер месяца для вывода статистики:");
        int month = scanner.nextInt();
        if (month > monthData.length || month < 0) {
            System.out.println("Ведён не корректный номер месяца");
            return;
        }
        MonthData monthDataNow = monthData[month - 1];
        int sumSteps = monthDataNow.sumStepsFromMonth();
        Converter converter = new Converter();
        monthData[month - 1].printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + monthDataNow.maxSteps());
        System.out.println("Среднее количество шагов: " + sumSteps / monthDataNow.days.length);
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого: " + monthDataNow.bestSeries(goalByStepsPerDay));
    }
    private void initMonthData(){
        for (int j = 0; j < monthData.length; j++) {
            monthData[j] = new MonthData();
        }
    }
}
