package calculator;

import calculator.arithmetic.*;
import calculator.exception.DivisionByZeroException;
import calculator.exception.InfinityValueException;
import calculator.exception.InvalidOperatorException;
import calculator.storage.SaveCalculator;

import java.util.stream.Collectors;

public class ArithmeticCalculator {
    /**
     * ArithmeticCalculator.java
     * Enum, 제네릭, 람다&스트림, 예외처리까지 구현된 Lv 3. 계산기
     *
     * setOperator메서드로 연산자 문자를 enum타입 객체로 변환하여 switch case절로 분류
     * 다형성으로 BasicCalculator 객체를 인스턴스를 다르게 선언하여 같은 calculate 메서드 이름으로 다르게 동작시킴
     * calculate 메서드는 제네릭 메서드로 Number타입을 상속받아 byte, double, float, int, long, short으로 범위를 제한
     *
     * 큰 수에대한 예외처리를 하고 호출하는 곳에서 처리하게함.
     * arithmetic/Division 에서 operate 메서드가 이곳에서 DivisionByZeroException 예외처리를 요청했다.
     * 하지만 한번 더 반복해서 또 호출하는 곳에서 처리하게 함 (App.java가 처리할 예정)
     *
     * largerResults 메서드는 resultHistory 필드에 저장된 요소들을
     * stream API로 파라미터로 전달받은 값보다 큰 요소만 필터링하여 String 형으로 반환함
     */
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
