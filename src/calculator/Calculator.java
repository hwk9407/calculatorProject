package calculator;


import java.util.ArrayList;

// 사칙연산을 수행 후,
// 결과값 반환 메서드 구현
// 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
public class Calculator {
    private ArrayList<Double> resultHistory;
    
    // 생성자. 필드 초기화
    Calculator() {
        this.resultHistory = new ArrayList<>();
    }

    public double calculate(int a, int b, char operator) {
        double result;

        if (operator == '+') {
            result = a + b;
            System.out.println("결과 : " + a + " " + operator + " " + b + " = " + result);
        } else if (operator == '-') {
            result = a - b;
            System.out.println("결과 : " + a + " " + operator + " " + b + " = " + result);
        } else if (operator == '*') {
            result = a * b;
            System.out.println("결과 : " + a + " " + operator + " " + b + " = " + result);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("나눗셈 연산에서는 두 번째 정수에 0이 입력될 수 없습니다.");
                // 에러 던져야함
                return 0;
            } else {
                result = (double) a / b;
                System.out.println("결과 : " + a + " " + operator + " " + b + " = " + result);
            }
        } else {
            System.out.println("연산 기호를 잘못 입력하였습니다.");
            // 에러 던져야함
            return 0;
        }

        resultHistory.add(result);
        return result;

    }

    // getter, setter
    public double getFirstResult () {
        return resultHistory.getFirst();
    }

    public void setFirstResult (double result) {
        resultHistory.addFirst(result);
    }
}
