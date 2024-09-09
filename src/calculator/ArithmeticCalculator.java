package calculator;

import calculator.arithmetic.*;
import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;

public class ArithmeticCalculator {
    private BasicCalculator calculator;

    // 생성자
    public ArithmeticCalculator(char opType) throws InvalidOperatorException {
        OperatorType type = OperatorType.getOperatorType(opType);
        if (type != null) {
            switch (type) {
                case OperatorType.PLUS:
                    calculator = new Addition();
                    break;
                case OperatorType.MINUS:
                    calculator = new Subtraction();
                    break;
                case OperatorType.MULTIPLY:
                    calculator = new Multiplication();
                    break;
                case OperatorType.DIVIDE:
                    calculator = new Division();
                    break;
            }
        }
        else {
            throw new InvalidOperatorException("연산 기호를 잘못 입력하였습니다.");
        }

    }

    // 제네릭 메서드로 오버로딩
    public <T extends Number> double calculate(T a, T b) throws DivisionByZeroException {
        double firstNum = Double.parseDouble(a.toString());
        double secondNum = Double.parseDouble(b.toString());

        return calculator.operate(firstNum, secondNum);
    }

}
