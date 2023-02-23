package ru.efomenko;

import java.util.Scanner;

public class StepTracker {
    private final MonthData[] monthData = new MonthData[12];
    private Scanner scanner;
    public StepTracker(Scanner scanner){
        this.scanner = scanner;
        for (int j = 0; j< monthData.length;j++){
            monthData[j] = new MonthData();
        }
    }
}
