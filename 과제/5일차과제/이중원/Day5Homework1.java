/*
    날짜 : 2021. 11. 10
    제작자 : 이중원
    과제.
    로또 번호 예측 프로그램으로 만들어보자.
    - 오름차순으로 정렬
    - 중복된 숫자 제거
*/

public class Day5Homework1 {
    public static void main(String[] args) {
        int[] numArr = new int[6];

        int temp = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    i--;
                }
            }

            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        System.out.print("로또 번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numArr[i] + "번 ");
        }

    }
}