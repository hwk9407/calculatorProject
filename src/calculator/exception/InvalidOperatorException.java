package calculator.exception;

import calculator.arithmetic.OperatorType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String msg) {
        super(msg + "\n지원되는 연산자 : " + Arrays.stream(OperatorType.values())
                .map(operatorType -> String.valueOf(operatorType.getSymbol()))
                .collect(Collectors.joining(", ")));
    }
}
