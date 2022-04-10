import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
        String choice = sc.next();

        double rd = Math.random();
        int cpu = (int)(rd*3)+1;


        if(choice.equals("가위")){
            if(cpu == 1){
                System.out.println("컴퓨터 : 가위");
                System.out.println("나    : 가위");
                System.out.println("비겼습니다.");
            }else if(cpu == 2){
                System.out.println("컴퓨터 : 바위");
                System.out.println("나    : 가위");
                System.out.println("졌습니다.");
            }else if(cpu == 3){
                System.out.println("컴퓨터 : 보");
                System.out.println("나    : 가위");
                System.out.println("이겼습니다.");
            }
        }else if(choice.equals("바위")){
            if(cpu == 1){
                System.out.println("컴퓨터 : 가위");
                System.out.println("나    : 바위");
                System.out.println("이겼습니다.");
            }else if(cpu == 2){
                System.out.println("컴퓨터 : 바위");
                System.out.println("나    : 바위");
                System.out.println("비겼습니다.");
            }else if(cpu == 3){
                System.out.println("컴퓨터 : 보");
                System.out.println("나    : 바위");
                System.out.println("졌습니다.");
            }
        }else if(choice.equals("보")) {
            if (cpu == 1) {
                System.out.println("컴퓨터 : 가위");
                System.out.println("나    : 보");
                System.out.println("졌습니다.");
            } else if (cpu == 2) {
                System.out.println("컴퓨터 : 바위");
                System.out.println("나    : 보");
                System.out.println("이겼습니다.");
            } else if (cpu == 3) {
                System.out.println("컴퓨터 : 보");
                System.out.println("나    : 보");
                System.out.println("비겼습니다.");
            }
        }else{
            System.out.println("잘못 입력했습니다.");
        }





    }
}
