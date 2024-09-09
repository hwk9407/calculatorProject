package calculator;

import calculator.arithmetic.BasicCalculator;
import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Calculator cal = new Calculator();
        ArithmeticCalculator aCal = new ArithmeticCalculator();

        // 실수 입력
        while (true) {
            double a, b;

            while (true) {
                try {
                    System.out.println("첫 번째 숫자를 입력해주세요.");
                    a = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) { // 입력값이 double형이 아닐 때
                    System.out.println("숫자를 입력해주세요!");
                    sc.nextLine();  // 입력 버퍼 비우기
                }
            }

            while (true) {
                try {
                    System.out.println("두 번째 숫자를 입력해주세요.");
                    b = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) { // 입력값이 double형이 아닐 때
                    System.out.println("숫자를 입력해주세요!");
                    sc.nextLine();  // 입력 버퍼 비우기
                }
            }


            // 사칙 연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요.");
            char operator = sc.next().charAt(0);

            /*// 기존 calculator객체 사용 연산자
            double result = cal.calculate(a, b, operator);

            System.out.println();*/

            try {
                aCal.setOperator(operator);
                double result2 = aCal.calculate(a, b);
                System.out.println("연산2 결과 : " + result2);
            } catch (InvalidOperatorException | DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }

//            System.out.println(cal.resultHistory); private 접근 제어자로 막았기 때문에 사용 불가. getter로 접근 해야함!

            /* Calculator 클래스의 메서드로 구현을 위한 주석처리
            if (operator == '+') {
                System.out.println(a + " " + operator + " " + b + " = " + (a + b));
            } else if (operator == '-') {
                System.out.println(a + " " + operator + " " + b + " = " + (a - b));
            } else if (operator == '*') {
                System.out.println(a + " " + operator + " " + b + " = " + (a * b));
            } else if (operator == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서는 두 번째 정수에 0이 입력될 수 없습니다.");
                } else {
                    System.out.println("결과 : " + a + " " + operator + " " + b + " = " + (a / b));
                }
            } else {
                System.out.println("연산 기호를 잘못 입력하였습니다.");
            }*/

            sc.nextLine();  // 입력 버퍼 비우기
            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("exit")) {
                if (aCal.calculator == null) return;
                BasicCalculator cal = aCal.calculator;

                if (cal.getAllData().isEmpty()) return;
                /*
                System.out.println("모든 저장 결과값 : " + cal.getAllData());
                System.out.println("처음으로 저장된 결과값 출력 : " + cal.getData(0));

                if (cal.getAllData().size() >= 2) {
                    System.out.println("저장된 결과값 갯수 : " + cal.getAllData().size());
                    cal.setData(1, 500);
                    System.out.println("2번째로 저장된 결과값을 500으로 변경 : " + cal.getAllData());
                }

                cal.removeFirstData();
                System.out.println("removeFirstResult 메서드 호출 후 저장 값 출력 : " + cal.getAllData());
                */

                // 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력
                while (true) {
                    try {
                        System.out.println("저장된 결과랑 크기를 비교할 숫자를 입력해주세요.");
                        double compareVal = sc.nextDouble();
                        aCal.largerResults(compareVal);
                        break;
                    } catch (InputMismatchException e) { // 입력값이 double형이 아닐 때
                        System.out.println("숫자를 입력해주세요!");
                        sc.nextLine();  // 입력 버퍼 비우기
                    }
                }

                return;
            }
        }

    }
}
