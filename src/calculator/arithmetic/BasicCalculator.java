package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;
import calculator.storage.SaveCalculator;

import java.util.ArrayList;

public abstract class BasicCalculator {
    /**
     * arithmetic/BasicCalculator.java
     * 연산클래스들의 부모 추상클래스
     * getter, setter 메서드들이있고 한개의 operate 추상 메서드가 있다.
     * 생성자 파라미터로 SaveCalculator 객체를 받아 getResultHistory() 메서드로 resultHistory 필드를 초기화한다.
     */
    private ArrayList<Double> resultHistory;

    BasicCalculator(SaveCalculator resultHistory) {
        this.resultHistory = resultHistory.getResultHistory();
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
