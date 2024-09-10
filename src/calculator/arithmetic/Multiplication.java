package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Multiplication extends BasicCalculator {
    /**
     * arithmetic/Multiplication.java
     * 곱셈 연산 클래스
     */

    public Multiplication(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {
        addData(a * b);
        return a * b;
    }
}
