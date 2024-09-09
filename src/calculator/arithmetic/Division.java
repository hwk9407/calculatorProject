package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;

public class Division extends BasicCalculator {

    @Override
    public double operate(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
