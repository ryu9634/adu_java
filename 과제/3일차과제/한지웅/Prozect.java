import java.util.Scanner;

public class Prozect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보자기 중 하나를 내세요.");

        String user = sc.next();
        int userNum;
        int 가위 = 1;
        System.out.println("당신 : 가위");
        int 바위 = 2;
        System.out.println("당신 : 바위");
        int 보 = 3;
        System.out.println("당신 : 보");

        double random = Math.random();
        int cpu = (int) (random * 3) + 1;
        if (cpu == 1) System.out.println("컴퓨터 : 가위");
        else if (cpu == 2) System.out.println("컴퓨터 : 바위");
        else if (cpu == 3) System.out.println("컴퓨터 : 보");

        if(userNum==cpu) {
            System.out.println("비겼습니다");

        }else if(userNum==1 && cpu==2){
            System.out.println("당신이 이겼습니다");}
        else if(userNum==1 && cpu==3){
            System.out.println("컴퓨터가 이겼습니다");}

        else if(userNum==2 && cpu==1){
            System.out.println("컴퓨터가 이겼습니다");}
        else if(userNum==2 && cpu==3){
            System.out.println("당신이 이겼습니다");}
        else if(userNum==3 && cpu==1){
            System.out.println("컴퓨터가 이겼습니다");}
        else if(userNum==3 && cpu==2){
            System.out.println("당신이 이겼습니다");}
        }
    }

















