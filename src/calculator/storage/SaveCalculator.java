package calculator.storage;

import java.util.ArrayList;

public class SaveCalculator {
    private ArrayList<Double> resultHistory;

    public SaveCalculator() {
        this.resultHistory = new ArrayList<>();
    }

    public ArrayList<Double> getResultHistory() {
        return this.resultHistory;
    }


}
