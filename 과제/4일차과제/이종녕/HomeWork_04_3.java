import java.util.Scanner;

public class HomeWork_04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("로또 프로그램을 돌리시겠습니까? 1.예 2.아니요");
            int num1 = sc.nextInt();

            if(num1 == 1 ) {
                while (true) {

                    for (int i = 0; i < 6; i++) {
                        double lot = Math.random();
                        int lotto = (int) (lot * 45) + 1;
                        System.out.print("[" + lotto + "]");
                    }
                    System.out.println();
                    break;

                }
            }else if(num1 ==2 ){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else  System.out.println("다시 입력해주세요");


        }
    }
}
