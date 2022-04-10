public class homework3_day4 {

    public static void main(String[] args) {
        System.out.println("로또 예측 번호를 뽑아 보자!");
        int a;
        for(int i=1; i<=6; i++){
            a=(int)(Math.random()*45)+1;
            System.out.print(a+" ");
        }

    }
}
