package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Addition extends BasicCalculator {
    /**
     * arithmetic/Addition.java
     * 덧셈 연산 클래스
     */
    public Addition(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {

        addData(a + b);
        return a + b;
    }


}
