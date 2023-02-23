package ru.efomenko;

public class MonthData {
    int[] days = new int[31];

    void printDaysAndStepsFromMonth() {
        for (int j = 0; j < days.length; j++) {
            System.out.println((j + 1) + "день: " + days[j]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int day : days) {
            sumSteps += day;
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxStepsDay = 0;
        for (int day : days) {
            if (maxStepsDay < day) {
                maxStepsDay = day;
            }
        }
        return maxStepsDay;
    }

    int bestSeries(int goalByStepsPerDay) {
        int bestSeries = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                bestSeries++;
            }
        }
        return bestSeries;
    }

}
