public class HomeWork1 {
    public static void main(String[] args) {
        /*과제.
        1.로또 번호 예측 프로그램을 만들어보자.
                - 오름차순으로 정렬
                - 중복된 숫자 제거*/

        int lotto[] = new int[6]; //배열 생성
        System.out.println("******************");
        System.out.println("로또 번호 예측 프로그램");
        System.out.println("******************");
        for (int i = 0; i < lotto.length; i++) {
            double random = Math.random();
            lotto[i] = (int) (random * 45) + 1; //랜덤 값

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }

        }//오른차순정렬
        int temp = 0;
        for(int i=0; i<lotto.length-1;i++){
            for(int j=i+1; j<lotto.length; j++){
                if(lotto[i]> lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}