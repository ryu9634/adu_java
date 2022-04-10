/*
과제1.
로또번호 예측 프로그램을 만들어보자 (배열을 이용)
 - 오름차순으로 정렬
 - 중복된 숫자 제거
 */
public class homeWork1 {
    public static void main(String[] args) {

        System.out.println("로또 번호를 출력합니다.");

        int[] num = new int[6];  //배열생성
        int Lotto; //로또번호
        for (int i = 0; i < 6; i++) {
            Lotto = (int) (Math.random() * 45) + 1; //로또 랜덤값
            num[i] = Lotto;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {   //중복일때 i 값을 제거하고 다시 숫자를 뽑음
                    i--;
                    break;
                }

            }

        }
        int temp = 0;  //숫자를 오름차순으로 나열
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1) +"번째 숫자 :"+num[i] );
        }
    }
}
