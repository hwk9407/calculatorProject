package calculator;

public enum OperatorType {
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/');
    private final char symbol;

    OperatorType(char symbol) {

        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
