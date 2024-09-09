package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;
import calculator.storage.SaveCalculator;

public class Division extends BasicCalculator {

    public Division(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        addData(a / b);
        return a / b;
    }
}
