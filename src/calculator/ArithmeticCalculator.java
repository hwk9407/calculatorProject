package calculator;

import calculator.arithmetic.*;
import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;
import java.util.stream.Collectors;

public class ArithmeticCalculator {
    public BasicCalculator calculator;

    // 생성자
    public ArithmeticCalculator() {
        BasicCalculator.initializeResult();
    }

    public void setOperator(char opType) throws InvalidOperatorException {
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
        } else {
            throw new InvalidOperatorException("연산 기호를 잘못 입력하였습니다.");
        }

    }

    // 제네릭 메서드로 오버로딩
    public <T extends Number> double calculate(T a, T b) throws DivisionByZeroException {
        double firstNum = Double.parseDouble(a.toString());
        double secondNum = Double.parseDouble(b.toString());

        return calculator.operate(firstNum, secondNum);
    }

    // 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력하는 메서드
    public void largerResults(double inputVal) {
        if (calculator.getAllData().isEmpty()) return;

        String bigResults = calculator.getAllData().stream()
                .filter(data -> data > inputVal)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(inputVal + " 보다 큰 결과값 : " + bigResults);

    }
}
