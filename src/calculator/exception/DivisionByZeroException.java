package calculator.exception;

public class DivisionByZeroException extends Exception {
    /**
     * exception/DivisionByZeroException.java
     * 나눗셈 연산시 두번째 파라미터가 0이면 발생하는 예외 클래스
     */
    public DivisionByZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
