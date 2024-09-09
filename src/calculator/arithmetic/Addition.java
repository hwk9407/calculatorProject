package calculator.arithmetic;

import calculator.storage.SaveCalculator;

public class Addition extends BasicCalculator {
    public Addition(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) {

        addData(a + b);
        return a + b;
    }


}
