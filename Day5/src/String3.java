import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 숫자를 입력하세요");
        String num = sc.next(); // 5346
        int result = 1;

        for(int i=0; i<num.length(); i++){
            System.out.print(num.substring(i, i+1) + " ");
            result *= Integer.parseInt(num.substring(i, i+1));
        }
        System.out.println("결과 : " + result);
    }
}
