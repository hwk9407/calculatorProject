package calculator.arithmetic;

import calculator.exception.DivisionByZeroException;
import calculator.storage.SaveCalculator;

public class Division extends BasicCalculator {
    /**
     * arithmetic/Division.java
     * 나눗셈 연산 클래스
     * 두번째 파라미터로 0이 오면 DivisionByZeroException 예외를 발생시키고 호출한곳에서 처리하게한다.
     */

    public Division(SaveCalculator resultHistory) {
        super(resultHistory);
    }

    @Override
    public double operate(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        addData(a / b);
        return a / b;
    }
}
