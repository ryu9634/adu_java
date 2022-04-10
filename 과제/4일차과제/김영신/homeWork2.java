import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        while(score < 10) {
            int firstNum = (int) (Math.random() * 10) + 1;
            int secondNum = (int) (Math.random() * 10) + 1;
            int operator = (int) (Math.random() * 4) + 1;   // 1 : +     2 : -    3 : *    4 : /

            switch(operator){
                case 1 :
                    System.out.println(firstNum + " + " + secondNum + " = ?");
                    System.out.println("현재 점수 : " + score);
                    answer = sc.nextInt();
                    if(firstNum + secondNum == answer){
                        System.out.println("Correct! +1점");
                        score++;
                    }
                    else
                        System.out.println("Try Again..");

                    break;
                case 2:
                    System.out.println(firstNum + " - " + secondNum + " = ?");
                    System.out.println("현재 점수 : " + score);
                    answer = sc.nextInt();
                    if(firstNum - secondNum == answer){
                        System.out.println("Correct! +1점");
                        score++;
                    }
                    else
                        System.out.println("Try Again..");

                    break;
                case 3:
                    System.out.println(firstNum + " * " + secondNum + " = ?");
                    System.out.println("현재 점수 : " + score);
                    answer = sc.nextInt();
                    if(firstNum * secondNum == answer){
                        System.out.println("Correct! +1점");
                        score++;
                    }
                    else
                        System.out.println("Try Again..");

                    break;
                case 4:
                    System.out.println(firstNum + " / " + secondNum + " = ?\n(단, 나머지를 제외하세요.)");
                    System.out.println("현재 점수 : " + score);
                    answer = sc.nextInt();
                    if(firstNum / secondNum == answer){
                        System.out.println("Correct! +1점");
                        score++;
                        System.out.println();
                    }
                    else
                        System.out.println("Try Again..");

                    break;
            }
            System.out.println("10점을 달성하셨습니다 축하합니다.");
        }
    }
}
