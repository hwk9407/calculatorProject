package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2개의 양의 정수 0포함 입력 받기
        while (true) {
            int a, b;

            while (true) {
                try {
                    System.out.println("첫 번째 0 또는 양의 정수를 입력해주세요.");
                    a = sc.nextInt();
                    if (a < 0) {
                        System.out.println("음수를 입력 하셨습니다.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) { // int가 아닐 때
                    System.out.println("숫자를 입력해주세요!");
                    sc.nextLine();  // 입력 버퍼 비우기
                }
            }

            while (true) {
                try {
                    System.out.println("두 번째 0 또는 양의 정수를 입력해주세요.");
                    b = sc.nextInt();
                    if (b < 0) {
                        System.out.println("음수를 입력 하셨습니다.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) { // int가 아닐 때
                    System.out.println("숫자를 입력해주세요!");
                    sc.nextLine();  // 입력 버퍼 비우기
                }
            }


            // 사칙 연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요.");
            char operator = sc.next().charAt(0);

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
            }

            sc.nextLine();  // 입력 버퍼 비우기
            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("exit")) {
                return;
            }
        }

    }
}
