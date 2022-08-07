package com.griddynamics.yvoronovskyi.calculator;

public class EnumCalculator {
    public int calculate(char op, int a, int b) {
        return OperationEnum.of(op).operate(a,b);
    }
}
