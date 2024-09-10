package calculator.storage;

import java.util.ArrayList;

public class SaveCalculator {
    /**
     * storage/SaveCalculator.java
     * 계산기에 연산 후 나온 결과값을 보관하는 클래스
     * 생성자를 통하여 객체를 생성하고 참조하고있는 객체를 getResultHistory로 반환
     */
    private ArrayList<Double> resultHistory;

    public SaveCalculator() {
        this.resultHistory = new ArrayList<>();
    }

    public ArrayList<Double> getResultHistory() {
        return this.resultHistory;
    }


}
