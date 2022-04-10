// 사칙연산의 답을 맞추는 퀴즈 게임 만들기
// (피연산자, 연산자 모두 랜덤, 나누기는 정수로 계산, 피연산자의 범위는 1 ~ 10이며, 10문제를 맞출 경우 게임 종료)
//    * 4 + 2 = ? 6
//      맞췄습니다.(1점) 점수 누적

public class HomeWork2_Day4_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산 게임을 시작합니다.");
        System.out.println("10점 득점시 게임이 종료됩니다.");

        int i = 0;

        while (i < 10) {                                          // 카운트가 10이 될때까지 돌아야 함
            double random1 = Math.random();
            int num = (int) (random1 * 10);
            double random2 = Math.random();
            int num2 = (int) (random2 * 10);
            double random3 = Math.random();
            int at = (int) (random3 * 4);                  // 사칙연산용 0, 1, 2, 3

            int cnt = 0;                                           // 카운트용
            int result = 0;
            String am = "";

            if (at == 0) {                                // 사칙연산 부호를 만들어야 함
                am = "+";
                result = num + num2;
            } else if (at == 1) {
                am = "-";
                result = num - num2;
            } else if (at == 2) {
                am = "*";
                result = num * num2;
            } else {
                am = "%";
                result = num % num2;
            }

            System.out.println(num + " " + am + " " + num2 + " = " + " ? ");
            int user = sc.nextInt();

            if(user == result){
                System.out.println("정답입니다.");
                i += cnt + 1;
                System.out.println("현재 정답 갯수 : " + i);
            }else{
                System.out.println("오답입니다.");
            }
        }
        System.out.println("축하합니다. 게임이 종료되었습니다.");
    }
}




