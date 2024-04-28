package homework;
/*
Задача 1. Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой
и самой длинной строки изначального массива.
*/

import classwork.ArraysMethods;

import java.util.Arrays;

public class ShortAndLongStrings {

    public static void main(String[] args) {

        String[] inputStrings = {"house", "car", "computer", "phone", "book", "game", "chair", "table"};
        String[] result = ArraysMethods.shortestAndLongest(inputStrings);
        System.out.println("Short and Long strings  = " + Arrays.toString(result));
    }
}