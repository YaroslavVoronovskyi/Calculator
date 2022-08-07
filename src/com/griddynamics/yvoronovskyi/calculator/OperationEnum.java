package com.griddynamics.yvoronovskyi.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public enum OperationEnum {
    OP_PLUS         ((a,b) -> a+b),
    OP_MINUS        ((a,b) -> a-b),
    OP_TIMES        ((a,b) -> a*b),
    OP_DIVISION     ((a,b) -> a/b);

    private static Map<Character, OperationEnum> operations =
            new HashMap<Character, OperationEnum>() {{
                put('+', OP_PLUS);
                put('-', OP_MINUS);
                put('*', OP_TIMES);
                put('/', OP_DIVISION);
            }};

    private BinaryOperator<Integer> operation;

    OperationEnum(BinaryOperator<Integer> operation) {
        this.operation = operation;
    }

    public static OperationEnum of(char op) {
        if(!operations.containsKey(op)) throw new IllegalArgumentException();

        return operations.get(op);
    }

    public int operate(int a, int b) {
        return operation.apply(a,b);
    }
}
