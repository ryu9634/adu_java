public class lotto1 {
    public static void main(String[] args) {
        int lottonum[] = new int[6];

        for(int i = 0; i < lottonum.length; i++){
            lottonum[i] = (int)(Math.random() * 45) + 1;
        }
            //로또 번호 6개 랜덤 생성

        int number = 0;
        for(int i = 0; i < lottonum.length-1; i++){
            for (int j = i+1; j < lottonum.length; j++) {
                if (lottonum[i] == lottonum[j]){
                    //lottonum i와 j =i+1이 같으면 i+1번째에 중복된 수기 나오지 않을 때까지 생성
                    lottonum[j] = (int)(Math.random() * 45) + 1;
                }
                if (lottonum[i] > lottonum[j]) {
                    number = lottonum[i];
                    lottonum[i] = lottonum[j];
                    lottonum[j] = number;
                }
            }
        }   System.out.print("로또 당첨번호 입니다. ");
        for (int i = 0; i < lottonum.length; i++) // i는 6개보다 적은 실수
        { System.out.print(lottonum[i] + " ");
        }

    }
}



