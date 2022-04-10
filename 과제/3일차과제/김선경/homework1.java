import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        // 가위: 1 바위: 2 보: 3
        System.out.println("가위바위보 게임을 시작하지");
        int com=(int)(Math.random()*3)+1;
        String comStr;
        if(com==1) comStr="가위";
        else if(com==2) comStr="바위";
        else comStr="보";
        Scanner sc=new Scanner(System.in);
        System.out.println("가위, 바위, 보 중에 선택하세요");
        String user=sc.next();
        int userNum;
        if(user.equals("가위")) userNum=1;
        else if(user.equals("바위")) userNum=2;
        else userNum=3;

        switch(com){
            case 1:
                if(userNum==1) System.out.println("비겼습니다.");
                else if(userNum==2) System.out.println("이겼습니다.");
                else System.out.println("졌습니다...");
                    break;
            case 2:
                if(userNum==1) System.out.println("졌습니다.");
                else if(userNum==2) System.out.println("비겼습니다.");
                else System.out.println("이겼습니다.");
                break;
            case 3:
                if(userNum==1) System.out.println("이겼습니다.");
                else if(userNum==2) System.out.println("졌습니다..");
                else System.out.println("비겼습니다.");
                break;
        }

        System.out.println("당신의 패는: "+user);
        System.out.println("컴퓨터의 패는: "+comStr);


    }
}
