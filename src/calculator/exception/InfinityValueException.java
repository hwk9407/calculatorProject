package calculator.exception;

public class InfinityValueException extends Exception {
    public InfinityValueException() {
        super("너무 큰 수 입니다.");
    }
}
