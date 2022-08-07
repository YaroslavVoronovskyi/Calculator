package com.griddynamics.yvoronovskyi.calculator;

public class Main {
    public static void main(String[] args) {
        EnumCalculator calculator = new EnumCalculator();
        System.out.println(calculator.calculate('+', 2 ,22));
        System.out.println(calculator.calculate('-', 22 ,2));
        System.out.println(calculator.calculate('/', 22 ,2));
        System.out.println(calculator.calculate('*', 2 ,22));
    }
}
