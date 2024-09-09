package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;

import java.util.ArrayList;

public abstract class BasicCalculator {
    private static ArrayList<Double> resultHistory;


    public static void initializeResult() {
        resultHistory = new ArrayList<>();
    }
    public abstract double operate(double a, double b) throws DivisionByZeroException;

    // getter, setter
    public double getData (int index) {
        return resultHistory.get(index);
    }

    public ArrayList<Double> getAllData() {
        return resultHistory;
    }

    public void setData(int index, double value) {
        resultHistory.set(index, value);
    }

    public void addData(double value) { resultHistory.add(value); }

    public void removeFirstData() {
        resultHistory.removeFirst();
    }

}
