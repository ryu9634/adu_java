import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주사위 숫자를 입력하세요.");
        int num = sc.nextInt();
/*
        double random = Math.random();
        int cpu = (int)(random * 6) + 1;

        if(num == cpu) System.out.println("주사위 숫자가 일치합니다.");
        System.out.println("결과");
        System.out.println("입력한 숫자 : " + num);
        System.out.println("주사위 숫자 : " + cpu);
 */
        // if문은 범위 비교가 장점
        if(num == 1) System.out.println("일");
        if(num == 2) System.out.println("이");
        if(num == 3) System.out.println("삼");
        if(num == 4) System.out.println("사");
        if(num == 5) System.out.println("오");
        if(num == 5) System.out.println("육");
    }
}
