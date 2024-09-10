package calculator.exception;

import calculator.arithmetic.OperatorType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InvalidOperatorException extends Exception {
    /**
     * exception/InvalidOperatorException.java
     * arithmetic/OperatorType에서 지원하는 연산자 이외의 문자를 입력시 처리되는 예외 클래스
     * 지원되는 연산자의 목록을 stream API, 람다표현식을 사용하여 작성
     */
    public InvalidOperatorException(String msg) {
        super(msg + "\n지원되는 연산자 : " + Arrays.stream(OperatorType.values())
                .map(operatorType -> String.valueOf(operatorType.getSymbol()))
                .collect(Collectors.joining(", ")));
    }
}
