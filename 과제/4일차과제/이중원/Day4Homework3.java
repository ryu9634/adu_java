/*
    로또 예측 프로그램을 만들어보자.
    (단 1~45 숫자 6개 추출, 중복된 숫자가 없어야 함)
*/

public class Day4Homework3 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            double random = Math.random();
            int num = (int) (random * 45) + 1;
            System.out.println("로또 예상 번호 : " + num);
        }
    }
}