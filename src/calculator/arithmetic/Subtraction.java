package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Subtraction extends BasicCalculator {
    /**
     * arithmetic/Subtraction.java
     * 뺄셈 연산 클래스
     */
    public Subtraction(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {
        addData(a - b);
        return a - b;
    }
}
