
/*
과제.
1. 로또 번호 예측 프로그램을 만들어보자.
- 오름차순으로 정렬
- 중복된 숫자 제거
 */

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("★★로또 예측★★");
        Random r = new Random();
        int num =6;  //  'num' = 6 자리 로또 번호
        int[] arr = new int[num]; // 'num' =6 자리 로또 번호
        int temp = 0;

        for(int i = 0; i < arr.length; i++) {
            //랜덤 숫자 뽑기
            arr[i] = r.nextInt(45) + 1;
            //중복 검사
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                   i--;
                }
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("당첨100% - 지금 당장 달려가세요!");
    }
}