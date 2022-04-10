//과제.
//아래 data.txt를 읽어 다음과 같이 출력하는 프로그램을 작성해보자.
//(학점은 평균기준이면 90점이상은 A, 80점이상은 B, 70점이상은 C, 60점이상은 D, 나머지는 F)
//data.txt
//김사과,90,80,100
//오렌지,100,90,70
//반하나,60,80,90
//이메론,70,80,85
//
//결과
//********** 성적 프로그램 **********
//이름 : 김사과
//국어점수 : 90
//영어점수 : 80
//수학점수 : 100
//총점 : xxx
//평균 : xxx
//학점 : xxx
//
//이름 : 오렌지
//국어점수
//...
//      작성자 : 이철

import java.io.FileInputStream;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        String file1 = "data.txt";
        Scanner sc;
        int tot;
        int avg;

        try {
            sc = new Scanner(new FileInputStream(file1));
            System.out.println("********** 성적 프로그램 **********");
            while (sc.hasNextLine()) {

                String str = sc.nextLine();
                String[] arr = str.split(",");
                System.out.println("학생 이름은 : " + arr[0]);
                System.out.println("국어점수는 : " + arr[1]);
                System.out.println("영어점수는 : " + arr[2]);
                System.out.println("수학점수는 : " + arr[3]);
                tot = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
                avg = tot / 3;
                System.out.println("총합은 : " + tot);
                System.out.println("평균은 : " + avg);

                if (avg >= 90) {
                    System.out.println("학점 : A ");
                } else if (avg <= 90 && avg >= 80) {
                    System.out.println("학점 : B ");
                } else if (avg <= 80 && avg >= 70) {
                    System.out.println("학점 : C ");
                } else if (avg <= 70 && avg >= 60) {
                    System.out.println("학점 : D ");
                } else {
                    System.out.println("학점 : F ");
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
