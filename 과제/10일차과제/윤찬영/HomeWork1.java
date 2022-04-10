import java.io.FileInputStream;
import java.util.Scanner;

/*
과제1.
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
 */
public class HomeWork1 {
    public static void main(String[] args) {
        String file1 = "data.txt";
        Scanner sc;
        try {
            FileInputStream fis = new FileInputStream(file1);
            sc = new Scanner(fis);
            System.out.println("*********성적 프로그램*********");
            while (sc.hasNextLine()) {    // 줄이 있는지 여부 확인
                String str = sc.nextLine();     // 한 줄 읽어오기
                String[] student = str.split(",");
                System.out.println("이름 : " + student[0]);
                System.out.println("국어점수 : " + student[1]);
                System.out.println("영어점수 : " + student[2]);
                System.out.println("수학점수 : " + student[3]);
                int sum = Integer.parseInt(student[1]) + Integer.parseInt(student[2]) + Integer.parseInt(student[3]);
                System.out.println("총점 : " + sum);
                double avg = sum / 3.0;
                System.out.println("평균 : " + avg);
                String grade;
                switch ((int) avg / 10) {
                    case 10:
                    case 9:
                        grade = "A";
                        break;
                    case 8:
                        grade = "B";
                        break;
                    case 7:
                        grade = "C";
                        break;
                    case 6:
                        grade = "D";
                        break;
                    default:
                        grade = "F";
                }
                System.out.println("학점 : " + grade);
                System.out.println("");

                fis.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
