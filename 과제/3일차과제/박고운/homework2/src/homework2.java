import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String me = scan.nextLine();
        Random random = new Random();//Math.random()을 사용할 때 숫자 아닌 한글로 입력 했을 때
                                     // 게임 실행이 되는 방법 없을까요??
        int user_int = random.nextInt(3);
        String user = null;
        System.out.println("결과");
        System.out.println("가위, 바위, 보 중 하나 선택");

        if(user_int==0) {
            user = "가위";
        }
        else if(user_int==1) {
            user = "바위";
        }
        else {
            user = "보";
        }
        System.out.println(user);
        if(me.equals("가위")&&user.equals("보")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals("바위")&&user.equals("가위")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals("보")&&user.equals("바위")) {
            System.out.println("승리하셨습니다");
        }
        else if(me.equals(user)) {
            System.out.println("비겼습니다");
        }
        else {
            System.out.println("패배하셨습니다.");
        }
    }
}