/*
로도 번호 예측 프로그램을 만들어보자.
- 오른차순 정렬
- 중복된 숫자 제거
 */
public class HomeWork1 {
    public static void main(String[] args) {

        int[] num = new int[45];

        for (int i = 0; i < 45; i++) {
            num[i] = i;
        } // num[i]에 1 ~ 45까지 순서대로 입력

        int temp = 0;
        for (int i = 0; i < 100; i++) {
            double random = Math.random();
            int k = (int) (random * 45); // 0~44사이 임의의 수(k)를 추출하여 num[k]와 num[0] 교체
            temp = num[0];
            num[0] = num[k];
            num[k] = temp;
        } // 이 과정을 100번 진행하여 완전히 1~45 숫자를 섞음

        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 6; j++) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        } // 오름차순 정열

        System.out.print("귀하의 로또 번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        } // 출력
    }
}
