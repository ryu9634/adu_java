import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사직연산 문제를 시작하겠습니다");
        int result = 0;
        int input;
        int a=1;
        while ( a <=10) {
            double random = Math.random();
            int i = (int) (random * 10) + 1;
            int j = (int) (random * 10) + 1;
            int k = (int) (random * 4) + 1;
            switch(k){
                case 1:
                    result= i+j;
                    System.out.println(i+" + "+j+" = ");
                    break;
                case 2:
                    result= i-j;
                    System.out.println(i+" - "+j+" = ");
                    break;
                case 3:
                    result= i/j;
                    System.out.println(i+" /" +j+" = ");
                    break;
                default:result= i*j;
                    System.out.println(i+" * "+j+" = ");
            }
                input= sc.nextInt();
            if(input==result){
                System.out.println(a+"째 정답");
               a++;
            }
        }
        System.out.println("모든 문제를 맞추셨습니다");
    }
}

//랜덤인데 숫자가 중복이 된다