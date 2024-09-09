package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Subtraction extends BasicCalculator {

    public Subtraction(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {
        addData(a - b);
        return a - b;
    }
}
