/*
로또 프로그램
중복 제거
오름 차순

 */

public class HomeWork1 {
    public static void main(String[] args) {

        int num = 6;
        int[] lotto = new int[num];

        System.out.println("로또 번호 예측 :");
        System.out.println("--------------------");

        for (int i = 0; i < lotto.length; i++) {
            int num2 = (int) (Math.random() * 45) + 1; //랜덤 으로 숫자 뽑기
            lotto[i] = num2;
            for (int j = 0; j < i; j++) { //중복 제거
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        int temp = 0;
        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) { //오름차순
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");

        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("프로그램 종료");
    }
}
