package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Multiplication extends BasicCalculator {

    public Multiplication(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {
        addData(a * b);
        return a * b;
    }
}
