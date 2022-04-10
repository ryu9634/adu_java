/*
    아래 data.txt를 읽어 다음과 같이 출력하는 프로그램을 작성해보자.
    (학점은 평균기준 90점 이상 A, 80점 이상 B, C, D, F)

    data.txt
    김사과,90,80,100
    오렌지,100,90,70
    반하나,60,80,90
    이메론,70,80,85


    결과
    ********** 성적 프로그램 **********
    이름 : 김사과
    국어점수 : 90
    영어점수 : 80
    수학점수 : 100
    총점 : ...
    평군 : ...
    학점 : ...

*/
import java.io.FileInputStream;
import java.util.Scanner;

public class Day10Homework {
    public static void main(String[] args) {
        String data = "data.txt";
        Scanner sc;
        try {
            sc = new Scanner(new FileInputStream(data));
            System.out.println("********** 성적 프로그램 **********");
            while (sc.hasNextLine()) {
                String s = sc.next();
                String[] student = s.split(",");

                System.out.println("---------------------------");
                System.out.println("이름 : " + student[0]);
                System.out.println("국어 : " + student[1]);
                System.out.println("영어 : " + student[2]);
                System.out.println("수학 : " + student[3]);

                int sum = Integer.parseInt(student[1]) + Integer.parseInt(student[2]) + Integer.parseInt(student[3]);
                System.out.println("총점수 : " + sum);

                int avg = sum / 3;
                System.out.println("평균 : " + avg);

                String grade;
                switch (avg / 10) {
                    case 10 :
                    case 9:
                        grade = "A";
                        System.out.println("학점 : " + grade);
                        break;
                    case 8:
                        grade = "B";
                        System.out.println("학점 : " + grade);
                        break;
                    case 7:
                        grade = "C";
                        System.out.println("학점 : " + grade);
                        break;
                    case 6:
                        grade = "D";
                        System.out.println("학점 : " + grade);
                        break;
                    default:
                        grade = "F";
                        System.out.println("학점 : " + grade);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
