package calculator.exception;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
