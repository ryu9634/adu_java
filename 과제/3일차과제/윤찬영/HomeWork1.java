import java.util.Scanner;

/*
가위 바위 보 게임 만들기
결과
가위, 바위, 보 중 하나를 선택하시오. 가위

컴퓨터 : 보
유저 : 가위
이겼습니다.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2) 중 하나를 숫자로 입력하여 선택하시오. >>> ");
        int user = sc.nextInt(); // 유저 입력

        double random = Math.random();
        int comp = (int)(random*3);

        switch (user){
            case 0 :
                if(comp ==0){
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 가위");
                    System.out.println("비겼습니다.");
                } else if(comp ==1){
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 가위");
                    System.out.println("졌습니다.");
                } else if(comp == 2){
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 가위");
                    System.out.println("이겼습니다.");
                }
                break;
             case 1 :
                if(comp ==0){
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 바위");
                    System.out.println("이겼습니다.");
                } else if(comp ==1){
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 바위");
                    System.out.println("비겼습니다.");
                } else if(comp == 2){
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 바위");
                    System.out.println("졌습니다.");
                }
                 break;
            case 2 :
                if(comp ==0){
                    System.out.println("컴퓨터 : 가위");
                    System.out.println("유저 : 보");
                    System.out.println("졌습니다.");
                } else if(comp ==1){
                    System.out.println("컴퓨터 : 바위");
                    System.out.println("유저 : 보");
                    System.out.println("이겼습니다.");
                } else if(comp == 2){
                    System.out.println("컴퓨터 : 보");
                    System.out.println("유저 : 보");
                    System.out.println("비겼습니다.");
                }
                break;
            default:
                System.out.println("입력값을 재확인바랍니다.");

        }



    }
}
