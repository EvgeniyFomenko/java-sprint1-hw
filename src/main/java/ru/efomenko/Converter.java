package ru.efomenko;

public class Converter {

   int convertToKm(int steps){
      int stepLength = 75;
      return steps * stepLength / 100000;
   }

   int convertStepsToKilocalories(int steps){
      int oneKcalories = 1000;
      int oneStepCalories = 50;
      return steps * oneStepCalories / oneKcalories;
   }

}
