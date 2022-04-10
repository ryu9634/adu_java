public class Homework1 {
    public static void main(String[] args) {

        int lotto[] = new int [6];


        for(int i=0; i< lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;  // 번호 생성


            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;                       // 중복 번호 제거
                }
            }
        }

        for (int i=0; i< lotto.length; i++){
            for(int j=i+1; j< lotto.length; j++){
                if(lotto[i]>lotto[j]){
                    int temp=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=temp;
                }
            }
        }

        System.out.print("로또 번호: ");


        for(int i=0; i< lotto.length; i++) {           // 번호 출력
            System.out.print(lotto[i] + " ");
        }
    }
}



