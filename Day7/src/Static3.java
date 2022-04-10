import java.util.Scanner;

public class Static3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하세요");
        double r = sc.nextDouble();
        double area = AreaUI.calcCircle(r);
        System.out.println("원의 넓이 : " + area);
    }
}
