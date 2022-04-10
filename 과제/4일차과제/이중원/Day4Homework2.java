/*
    과제2.
    사칙연산의 답을 맞추는 퀴즈게임 만들기
    (단, 피연산자와 연산자는 모두 랜덤 나누기는 정수로만 계산,
     피연산자의 범위는 1~10이며,
     10점(10문제를 맞췄을 경우)을 달성할 경우 게임종료)
*/

import java.util.Scanner;

public class Day4Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int result;
        int inputResult;

        while(score < 10){
            int num1 = (int)(Math.random()*10)+1; // 1,2,3,4,5,6,7,8,9,10
            int num2 = (int)(Math.random()*10)+1;
            int calculatorRandom = (int)(Math.random()*4); // 0, 1, 2, 3

            if (calculatorRandom == 0) {
                System.out.println("----------------");
                System.out.println("점수 : " + score);
                System.out.print(num1 + " + " + num2 + " = ");
                inputResult = sc.nextInt();
                result = num1 + num2;
                if (result == inputResult) {
                    score++;
                    System.out.println("정답");
                } else {
                    System.out.println("오답");
                }
            } else if (calculatorRandom == 1) {
                System.out.println("----------------");
                System.out.println("점수 : " + score);
                System.out.print(num1 + " - " + num2 + " = ");
                inputResult = sc.nextInt();
                result = num1 - num2;
                if (result == inputResult) {
                    score++;
                    System.out.println("정답");
                } else {
                    System.out.println("오답");
                }
            } else if (calculatorRandom == 2) {
                System.out.println("----------------");
                System.out.println("점수 : " + score);
                System.out.print(num1 + " * " + num2 + " = ");
                inputResult = sc.nextInt();
                result = num1 * num2;
                if (result == inputResult) {
                    score++;
                    System.out.println("정답");
                } else {
                    System.out.println("오답");
                }
            } else if (calculatorRandom == 3) {
                System.out.println("----------------");
                System.out.println("점수 : " + score);
                System.out.print(num1 + " / " + num2 + " = (정수만 입력)");
                inputResult = sc.nextInt();
                result = num1 / num2;
                if (result == inputResult) {
                    score++;
                    System.out.println("정답");
                } else {
                    System.out.println("오답");
                }
            }

        }
    }
}
