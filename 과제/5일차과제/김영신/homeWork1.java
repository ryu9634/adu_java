/*
    절차
    1. 6개의 난수원소 배열에 초기화
    2. 배열 원소간 중복 확인
    3. 오름차순 정렬
 */

import java.util.Arrays;

public class homeWork1 {
    public static void main(String[] args) {
        int[] lottoNum = new int[6];
        int random;
        int temp;

        for (int i = 0; i < 6; i++) {
            random = (int) (Math.random() * 45 + 1);
            lottoNum[i] = random;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) continue;
                if (lottoNum[i] == lottoNum[j]) {
                    lottoNum[j] = (int) (Math.random() * 45 + 1);
                    i = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < lottoNum.length - 1; i++) {
            for (int j = i + 1; j < lottoNum.length; j++) {
                if (lottoNum[i] > lottoNum[j]) {
                    temp = lottoNum[i];
                    lottoNum[i] = lottoNum[j];
                    lottoNum[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lottoNum));
        /*
        for(int lotto : lottoNum)
            System.out.print(lotto + " ");
         */
    }
}
