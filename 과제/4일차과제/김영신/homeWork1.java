import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 중 선택하세요");

        int winVal = 0;

        while(winVal < 1) {
            int ran = (int) (Math.random() * 2) + 1;   // 0 : 가위   1 : 바위  2 : 보
            String player = sc.next();

            if (player.equals("가위")) {
                System.out.println
                        (ran == 0 ? "컴퓨터 : 가위\nDraw!" : ran == 1 ? "컴퓨터 : 바위\nLose!" : "컴퓨터 : 보\nWin!");
                if (ran == 2) winVal++;
            } else if (player.equals("바위")) {
                System.out.println(ran == 1 ? "컴퓨터 : 바위 \nDraw!" : ran == 2 ? "컴퓨터 : 보\nLose!" : "컴퓨터 : 가위\nWin!");
                if (ran == 0) winVal++;
            } else if (player.equals("보")) {
                System.out.println(ran == 2 ? "컴퓨터 : 보\nDraw!" : ran == 0 ? "컴퓨터 : 가위\nLose!" : "컴퓨터 : 바위\nWin!");
                if (ran == 1) winVal++;
            } else
                System.out.println("다시 입력하세요");
        }
    }
}
