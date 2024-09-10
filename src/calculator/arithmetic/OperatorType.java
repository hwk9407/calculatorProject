package calculator.arithmetic;

public enum OperatorType {
    /**
     * arithmetic/OperatorType.java
     * 연산 기호를 정의하는 enum 클래스
     */
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/');
    private final char symbol;

    OperatorType(char symbol) {

        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType getOperatorType(char symbol) {
        switch (symbol) {
            case '+': return PLUS;
            case '-': return MINUS;
            case '*': return MULTIPLY;
            case '/': return DIVIDE;
            default: return null;
        }
    }
}
