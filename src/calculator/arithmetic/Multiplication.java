package calculator.arithmetic;

public class Multiplication extends BasicCalculator {

    @Override
    public double operate(double a, double b) {
        addData(a * b);
        return a * b;
    }
}
