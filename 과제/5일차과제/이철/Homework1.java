/*
        과제1. 로또 번호 예측 프로그램을 만들어보자.
        - 오름차순으로 정렬 // 1, 3, 11, 34, 45, 23
        - 중복된 숫자 제거
        작성자 : 이철
 */
public class Homework1 {
    public static void main(String[] args) {
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                }
            }
        }
        int temp = 0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {

                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("로또번호는 : " + num[i] + " ");
        }
    }
}