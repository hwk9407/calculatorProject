package calculator.exception;

public class InfinityValueException extends Exception {
    /**
     * exception/InfinityValueException.java
     * double형 범위를 넘어서 오버플로우가 발생할시 처리되는 예외 클래스
     */
    public InfinityValueException() {
        super("너무 큰 수 입니다.");
    }
}
