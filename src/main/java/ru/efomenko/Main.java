package ru.efomenko;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int key = scanner.nextInt();
            if (key == 1) {
                System.out.println("Выполняется логика комманды 1");
            } else if (key == 2) {
                System.out.println("Выполняется логика комманды 2");
            } else if (key == 3) {
                System.out.println("Выполняется логика комманды 3");
            } else if (key == 0) {
                System.out.println("Выполняется выход");
                return;
            } else {
                System.out.println("Такой комманды нет ");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - ввод цели по количеству шагов в день");
        System.out.println("2 - ввод пройденного количества шагов за день");
        System.out.println("3 - вывод статистики за определённый месяц");
        System.out.println("0 - выход");
    }
}
