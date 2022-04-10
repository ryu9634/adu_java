public class homework1_day5 {
    public static void main(String[] args) {
        System.out.println("로또 예측 번호를 뽑아 보자!");

        // 로또 번호가 저장될 6자리수 배열 선언
        int[] lotto = new int[6];

        // 로또번호 추출
        for(int i=0; i<lotto.length; i++){
            lotto[i]=(int)(Math.random()*45)+1;

            // 중복값 확인
            for(int j=0; j<i; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }


            }
        // 오름차순 정렬
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j =i+1; j<6; j++){
                if(lotto[i]>lotto[j]){
                    temp=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=temp;
                }
            }

        }
            // 결과값 출력
            for (int j = 0; j < 6; j++) {
            System.out.print(lotto[j]+" ");
        }
    }
}

