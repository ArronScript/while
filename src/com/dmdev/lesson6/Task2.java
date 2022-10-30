package com.dmdev.lesson6;

public class Task2 {
    public static void main(String[]args) {
        double cash=5000;

    }
    public static double CashUp(double cash) {
        double result = cash;
        for (int saleyear = 2021 + 1; saleyear <= 2022; saleyear++) {
            double percent = result * 0.03;
            result += percent;
            result -= result * 5 / 100;
            System.out.println(saleyear + ":" + result);

        }
        return result;

    }
}