package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;

import java.util.ArrayList;

public abstract class BasicCalculator {
    ArrayList<Double> resultHistory;
    private double firstNum, secondNum;

    public BasicCalculator() {
        resultHistory = new ArrayList<>();
    }
    public abstract double operate(double a, double b) throws DivisionByZeroException;

    // getter, setter
    public double getData (int index) {
        return resultHistory.get(index);
    }

    public ArrayList<Double> getAllData() {
        return this.resultHistory;
    }

    public void setData(int index, double value) {
        resultHistory.set(index, value);
    }

    public void removeFirstData() {
        resultHistory.removeFirst();
    }

}
