/*
   1.로또 번호 예측 프로그램을 만들어보자.
- 오름차순으로 정렬
- 중복된 숫자 제거
*/

   import java.lang.reflect.Array;
   import java.util.Arrays;

public class DayHomeWork1 {
    public static void main(String[] args) {
        int []lottoNum = new int[1];
        int random;


        for (int i = 0; i < 1; i++) {
            random = (int) (Math.random() * 45 + 1);
            lottoNum[i] = random;

        for (int j = 0; i < 1; i++){
            for (int j =0; j < 1; j++) {
                if (i == j) continue;
                if (lottoNum[i] == lottoNum[j]){
                    lottoNum[j] = (int) (Math.random() * 45+1); // 랜덤
                    i= 0;
                    break;
                }


            }
        }
        for (int j = 0; i < lottoNum.length-1; i++){
            for (int j = i + 1; j < lottoNum.length; j++){
                for (lottoNum[i] = lottoNum[j];
                     lottoNum[j] == random;

            }
            System.out.println();
        }

        }







    }








}
