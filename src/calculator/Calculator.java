package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2개의 양의 정수 0포함 입력 받기

        // 반복문으로 잘못 입력할시 제대로 입력할때까지 반복 추가해야함
        System.out.println("첫 번째 0 또는 양의 정수를 입력해주세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 0 또는 양의 정수를 입력해주세요.");
        int b = sc.nextInt();

        // 사칙 연산 기호 입력 받기

        // 반복문으로 잘못 입력할시 제대로 입력할때까지 반복 추가해야함
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
                return;
            }
            System.out.println(a + " " + operator + " " + b + " = " + (a / b));
        }

    }
}
