import java.util.Scanner;

public class Method4 {

    public static int plus(int num1, int num2){
        return num1 + num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    public static int mul(int num1, int num2){
        return num1 * num2;
    }
    public static int div(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        int result1 = plus(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result1);

        int result2 = sub(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result2);

        int result3 = mul(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result3);

        int result4 = div(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result4);
    }
}
