import java.util.Scanner;

/*
과제2.
사칙연산의 답을 맞추는 퀴즈 게임 만들기
(단, 피연산자와 연산자는 모두 랜덤, 나누기는 정수로만 계산, 피연산자의 범위는 1~10이며,
10점을 달성할 경우(10문제를 맞췃을경우)을 달성한 경우 게임종료)
ex)
4* 2 = ? 8
맞췄습니다. (1점)
4 + 2 = ? 7
틀렸습니다.
4* 2 = ? 8
맞췄습니다. (1점)
...
...
 */
public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (!(i == 11)) {
            int ran1 = (int) (Math.random() * 10) + 1;
            int ran2 = (int) (Math.random() * 10) + 1;
            int opt = (int) (Math.random() * 4) + 1;
            int result = 0;
            String mid = "";
            if (opt == 1) {
                mid = "+";
                result = ran1 + ran2;
            } else if (opt == 2) {
                mid = "-";
                result = ran1 - ran2;
            } else if (opt == 3) {
                mid = "*";
                result = ran1 * ran2;
            } else {
                mid = "/";
                result = ran1 / ran2;
            }
            System.out.println(ran1 + "" + mid +""+ ran2 + " =   ?");
            int user = sc.nextInt();

            if (result == user) {
                System.out.println("정답입니다." + i +"점");
                i++;
            }else  {
                System.out.println("틀렸습니다.");
            }





        }
    }
}