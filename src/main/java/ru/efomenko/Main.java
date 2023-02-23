package ru.efomenko;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int key = scanner.nextInt();
            if (key == 1) {
                stepTracker.changeStepGoal();
            } else if (key == 2) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (key == 3) {
                stepTracker.printStatistic();
            } else if (key == 0) {
                System.out.println("Выполняется выход");
                return;
            } else {
                System.out.println("Такой комманды нет ");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - Изменение цели по количеству шагов в день");
        System.out.println("2 - Сохранение пройденного количества шагов за день");
        System.out.println("3 - вывод статистики за определённый месяц");
        System.out.println("0 - выход");
    }
}
