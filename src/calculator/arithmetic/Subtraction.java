package calculator.arithmetic;

public class Subtraction extends BasicCalculator {

    @Override
    public double operate(double a, double b) {
        addData(a - b);
        return a - b;
    }
}
