import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 참조변수
        int input = sc.nextInt();
        System.out.println("입력받은 숫자 : " + input);
        String str = sc.next();
        System.out.println("입력받은 문자열 : " + str);
    }
}
