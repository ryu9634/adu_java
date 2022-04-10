import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        try {
            System.out.println("숫자를 입력하세요");
            value = sc.nextInt();
//            int num = value / 0;
        }catch (InputMismatchException e) {
            value = -1;
            System.out.println("InputMismatchException 발생!");
        }catch (Exception e){
            value = -2;
            System.out.println("Exception 발생!");
        }finally {
            System.out.println("value : " + value);
        }
    }
}
