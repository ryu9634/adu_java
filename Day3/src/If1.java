import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();

//        if(age > 19) System.out.println("성인입니다.");

        if(age > 19) {
            System.out.println("성인입니다");
            System.out.println("20살 이상입니다.");
        }
        System.out.println("프로그램을 종료합니다");
    }
}
