/*과제1.
        아래 data.txt를 읽어 다음과 같이 출력하는 프로그램을 작성해보자
        (학점은 평균기준이며 90점 이상은... D, 나머지는 F)
        김사과,90,80,100           // , 를 기준으로 split
        오렌지,100,90,70
        반하나,60,80,90
        이메론,70,80,85

        결과
        *********성적 프로그램*********
        이름 : 김사과
        국어점수 : 90
        영어점수 : 80
        수학점수 : 100
        총점 : XXX
        평균 : XXX
        학점 : X
data.txt
김사과,90,80,100
오렌지,100,90,70
반하나,60,80,90
이메론,70,80,85
 */


import java.io.FileInputStream;
import java.util.Scanner;

public class day10HomeWork1 {
    public static void main(String[] args) {
        String file1 = "data.txt";
        Scanner sc;
        try {
            sc = new Scanner(new FileInputStream(file1));
            System.out.println("성적프로그램");
            while (sc.hasNextLine()) {
                String str = sc.next();
                boolean collegestudent = str.equals("");
                System.out.println("이름 : collegestudent[0]");
                System.out.println("국어 :  + collegestudent[1]");
                System.out.println("수학 : collegestudent[2]");
                int sum;
                sum = Integer.parseInt(collegestudent[1] + Integer.parseInt(collegestudent[2])) + Integer.parseInt(collegestudent[3]);
                System.out.println("총점수 : + sum ");
                double avg = 3.0;
                System.out.println("평균점수 : " + avg);
                String grade;
                switch ((int) avg / 30) {
                    case 5:
                        ;
                    case 4:
                        grade = "A";
                        break;
                    case 3:
                        grade = "B";
                        break;
                    case 2:
                        grade = "C";
                        break;
                    case 1:
                        grade = "D";
                        break;
                    case 0:
                        grade = "F";
                        break;
                    System.out.println("대학학점 : " + grade);


                }
            }
        } catch (Exception e) {

        }
    }
}