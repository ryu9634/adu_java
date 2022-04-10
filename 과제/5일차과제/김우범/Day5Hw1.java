//과제
//        1. 로또 번호 예측 프로그램을 만들어보자.
//        - 오름차순으로 정렬
//        - 중복된 숫자 제거

import java.util.Random;

public class Day5Hw1 {
    public static void main(String[] args) {
        System.out.println("로또 번호 추첨기");

        int LottoNumber[] = new int[7];
        Random random = new Random();

        int min=1;
        int max=45;
        for (int i = 0; i < LottoNumber.length; i++) {
            LottoNumber[i] = (random.nextInt((max - min)+1)+min);

            for (int j = 0; j < i; j++) {
                if(LottoNumber[i] == LottoNumber[j]){
                    i--;
                }
                if(LottoNumber[i] < LottoNumber[j]){
                    int temp = LottoNumber[i];
                    LottoNumber[i] = LottoNumber[j];
                    LottoNumber[j] = temp;
                }

            }
        }

        for (int i = 0; i <LottoNumber.length; i++) {
            System.out.print(" [" +LottoNumber[i]+"] ");
        }
        System.out.println("☆★추☆★첨☆★완☆★료☆★");
    }
}
