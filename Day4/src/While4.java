import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 단을 입력하세요");
        int dan = sc.nextInt();
        int i = 1;
        /*
            5단
            5 * 1 = 5
            5 * 2 = 10
            5 * 3 = 15
            ...
            5 * 9 = 45
         */
        System.out.println(dan + "단");
        while(i <= 9){
            System.out.println(dan + " * " + i + " = " + (dan * i));
            i++;
        }
    }
}
