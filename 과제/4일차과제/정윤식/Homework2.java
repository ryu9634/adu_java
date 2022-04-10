import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        String op1;
        int result = 0;



        for (int i=1; i<=10; i++ ) {
            for(int tot=1; tot<=10; tot++){
            Random rd1 = new Random();
            int ranNum1 = (rd1.nextInt(50) + 51);
            System.out.println("첫번째 숫자는 " + ranNum1);

            Random rd2 = new Random();
            int ranNum2 = (rd2.nextInt(10) + 1);
            System.out.println("두번째 숫자는 " + ranNum2);


            String[] op = new String[4];
            op[0] = "+";
            op[1] = "-";
            op[2] = "*";
            op[3] = "/";

            Random rd = new Random();
            int ranNum = rd.nextInt(4);

            op1 = op[ranNum];

            if (op1.equals("+")) {
                result = ranNum1 + ranNum2;
            } else if (op1.equals("-")) {
                result = ranNum1 - ranNum2;
            } else if (op1.equals("*")) {
                op1 = op[2];
                result = ranNum1 * ranNum2;
            } else {
                result = ranNum1 / ranNum2;
            }

            System.out.println(ranNum1 + op1 + ranNum2 + "= " + result);
            System.out.println("👍정답입니다!!👍");
                System.out.println("현재점수:"+tot);




        } break;
        }
        System.out.println("10점 만점 종료합니다");
    }
    }
