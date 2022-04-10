//        과제3 .
//        로또 예측 프로그램을 만들어보자.
//        (단, 1~45 숫자 6개를 추출)


import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("★★로또 예측★★");
        Random r = new Random();
        int rot = 0;

        for(int i = 0; i <= 5; i++){
                rot = r.nextInt(45) + 1;
                System.out.print(rot + " ");
        }
        System.out.println("");
        System.out.println("당첨100% - 지금 당장 달려가세요!");
    }
}
