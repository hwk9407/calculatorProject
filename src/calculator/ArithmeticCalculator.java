package calculator;

public class ArithmeticCalculator extends Calculator {

    // 제네릭 메서드로 오버로딩
    public <T extends Number> double calculate(T a, T b, char opType) {
        double result = 0;
        OperatorType type = OperatorType.getOperatorType(opType);
        if (type != null) {
            switch (type) {
                case OperatorType.PLUS:
                    result = a.doubleValue() + b.doubleValue();
                    break;
                case OperatorType.MINUS:
                    result = a.doubleValue() - b.doubleValue();
                    break;
                case OperatorType.MULTIPLY:
                    result = a.doubleValue() * b.doubleValue();
                    break;
                case OperatorType.DIVIDE:
                    if (b.doubleValue() == 0) {
                        System.out.println("0으로 나눌 수 없습니다!");
                        break;
                    }
                    result = a.doubleValue() / b.doubleValue();
                    break;
                default:
                    System.out.println("알 수 없는 연산자입니다.");
            }
        }/*
        else {
            throw new IllegalStateException("Unexpected value: " + opType);
        }*/
        return result;
    }

}
