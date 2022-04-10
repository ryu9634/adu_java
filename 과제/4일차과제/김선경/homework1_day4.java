import java.sql.SQLOutput;
import java.util.Scanner;

public class homework1_day4 {
    public static void main(String[] args) {
        // 가위: 1 바위: 2 보: 3
        System.out.println("가위바위보 게임을 시작하지");
        boolean stopGame=true;
        // 무한 반복 루프
        while (stopGame=true) {
            // 컴퓨터 차례
            int com=(int)(Math.random()*3)+1;

            // 1, 2, 3 숫자에 컴퓨터 패를 매치시킴
            String comStr;
            if(com==1) comStr="가위";
            else if(com==2) comStr="바위";
            else comStr="보";

            // 유저 차례
            Scanner sc=new Scanner(System.in);
            System.out.println("가위, 바위, 보 중에 선택하세요");
            String user=sc.next();
            // 유저 패를 숫자에 일치시킴
            int userNum;
            if(user.equals("가위")) userNum=1;
            else if(user.equals("바위")) userNum=2;
            else userNum=3;

            // 본게임 루프
            // 유저가 가위일때
            if(userNum==1){
                System.out.println("당신의 패는: " +user);
                System.out.println("컴퓨터의 패는: " +comStr);
                switch (com){
                    case 1:
                        System.out.println("비겼습니다.");
                        break;
                    case 2:
                        System.out.println("졌습니다.");
                    case 3:
                        System.out.println("이겼습니다.");
                        stopGame=false;
                        break;
                }
            }

            //유저가 바위일때
            else if(userNum==2){
                System.out.println("당신의 패는: " +user);
                System.out.println("컴퓨터의 패는: " +comStr);
                switch (com){
                    case 1:
                        System.out.println("이겼습니다.");
                        stopGame=false;
                        break;
                    case 2:
                        System.out.println("비겼습니다.");
                        break;
                    case 3:
                        System.out.println("졌습니다.");
                        break;
                }

                //유저가 보일때
            }else{
                System.out.println("당신의 패는: " +user);
                System.out.println("컴퓨터의 패는: " +comStr);
                switch (com){
                    case 1:
                        System.out.println("졌습니다..");
                        break;
                    case 2:
                        System.out.println("이겼습니다");
                        stopGame=false;
                        break;
                    case 3:
                        System.out.println("비겼습니다.");
                        break;
                }
            }

            if(stopGame==false) break;
        }
    }
}
