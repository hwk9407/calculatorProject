package calculator;

import calculator.arithmetic.*;
import calculator.exception.DivisionByZeroException;
import calculator.exception.InfinityValueException;
import calculator.exception.InvalidOperatorException;
import calculator.storage.SaveCalculator;

import java.util.stream.Collectors;

public class ArithmeticCalculator {
    public BasicCalculator calculator;
    private SaveCalculator saveCalculator;

    // 생성자
    public ArithmeticCalculator() {
        this.saveCalculator = new SaveCalculator();
    }

    public void setOperator(char opType) throws InvalidOperatorException {
        OperatorType type = OperatorType.getOperatorType(opType);
        if (type != null) {
            switch (type) {
                case OperatorType.PLUS:
                    calculator = new Addition(saveCalculator);
                    break;
                case OperatorType.MINUS:
                    calculator = new Subtraction(saveCalculator);
                    break;
                case OperatorType.MULTIPLY:
                    calculator = new Multiplication(saveCalculator);
                    break;
                case OperatorType.DIVIDE:
                    calculator = new Division(saveCalculator);
                    break;
            }
        } else {
            throw new InvalidOperatorException("연산 기호를 잘못 입력하였습니다.");
        }

    }

    // 제네릭 메서드로 오버로딩
    public <T extends Number> double calculate(T a, T b) throws DivisionByZeroException, InfinityValueException {
        double firstNum = Double.parseDouble(a.toString());
        double secondNum = Double.parseDouble(b.toString());
        double result = calculator.operate(firstNum, secondNum);
        if (Double.isInfinite(result)) throw new InfinityValueException();

        return result;
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
