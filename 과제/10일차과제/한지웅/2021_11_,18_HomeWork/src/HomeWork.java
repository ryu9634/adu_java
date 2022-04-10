import java.io.FileInputStream;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        String file1 = "data.txt";
        Scanner sc;
        try {
            FileInputStream fis = new FileInputStream(file1);
            sc = new Scanner(fis);
            System.out.println("❤❤❤❤❤❤성적❤❤❤❤❤❤");
            for (int i = 0; i < 5; i++) {

                String str = sc.nextLine();
                String[] student = str.split(",");
                System.out.println("이름 : " + student[0]);
                System.out.println("국어점수 : " + student[1]);
                System.out.println("영어점수 : " + student[2]);
                System.out.println("수학점수 : " + student[3]);
                //Integer.parseInt 를 사용하여 문자열을 숫자열로 출력후 국 영 수 합을 구한다.
                // 이를 하지 않고 단순히 다하면 60+80+90 = 230 이 아니라 608090이 된다.
                int tot = Integer.parseInt(student[1]) + Integer.parseInt(student[2]) +Integer.parseInt(student[3]);
                System.out.println("총점 : " + tot);
                // int 값으로는 표기할수 없는 소수점 자리 숫자를 표현 하기 위하여 double을 사용해준다.
                double avg = tot / 3.0;
                System.out.println("평균 : " + avg);

                String grade;
                switch ((int) avg / 10 ){
                    case 9 :
                        grade = "A";
                        break;  //break; 를 사용하여 조건 충족시 다음 으로 넘어가서 다시 실행하게 한다.
                    case 8 :
                        grade = "B";
                        break;
                    case 7 :
                        grade = "C";
                        break;
                    case 6 :
                        grade = "D";
                        break;
                    // default 를 사용하여 이외의 값을 "F" 처리한다.
                    default:
                        grade = "F";
                }
                System.out.println("학점 : " + grade);
                System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
            }
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

