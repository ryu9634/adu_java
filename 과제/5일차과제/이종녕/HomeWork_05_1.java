public class HomeWork_05_1 {
    public static void main(String[] args) {


        System.out.println("로또 번호를 추첨 하였습니다.");


        //배열 6개 설정하기
        int num1 = 6;
        int[] lotto1 = new int[num1];

        //랜덤으로 번호 뽑고 겹치지 않게 설정하기

        for (int i = 0; i < lotto1.length; i++) {
            double rd1 = Math.random();
            int lotto = (int) (rd1 * 45) + 1;
            lotto1[i] = lotto;
            for (int j = 0; j < i; j++) {
                if (lotto1[i] == lotto1[j]) {
                    i--;
                    break;


                }

            }


        }

        //나온 값을 오름차순으로 정리하기
        int temp = 0;
        for (int i = 0; i < lotto1.length - 1; i++) {
            for (int j = i + 1; j < lotto1.length; j++) {
                if (lotto1[i] > lotto1[j]) {
                    temp = lotto1[i];
                    lotto1[i] = lotto1[j];
                    lotto1[j] = temp;


                }


            }

        }
        for (int i = 0; i < lotto1.length; i++) {
            System.out.print(lotto1[i] + " ");
        }


    }


}










