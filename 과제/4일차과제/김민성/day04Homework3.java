/*
로또 예측 프로그램을 만들어보자.
(단, 1~45 숫자6개를 추출, 중복된 숫자가 없어야 함)
 */
public class day04Homework3 {
    public static void main(String[] args) {
        System.out.println("로또 숫자 : " );
        for (int i = 0; i < 7; i++) {
            double random = Math.random();
            int ro = (int) (random * 45 + 1);
            System.out.println(ro + " ");
        }
    }
}
