
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 유효성 검사입니다.");
        String num = sc.next();
        int[] code = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum = 0;
        int tot = 0;

        for(int i = 0; i<code.length; i++){
            sum += Integer.parseInt(num.substring(i, i+1)) * code[i];

        }
        System.out.println(sum);
    }
}
