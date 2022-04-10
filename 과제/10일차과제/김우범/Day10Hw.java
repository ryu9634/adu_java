import java.io.FileInputStream;
import java.util.Scanner;

public class Day10Hw {
    public static void main(String[] args) {
        Scanner sc;
        String data = "data.txt";
        System.out.println("*********** 성적 프로그램 **********");

        try {
            sc = new Scanner(new FileInputStream(data));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arr = line.split(",");
                System.out.println("이름 : " + arr[0]);
                System.out.println("국어점수 : " + arr[1]);
                System.out.println("영어점수 : " + arr[2]);
                System.out.println("수학점수 : " + arr[3]);
                Integer kor = Integer.parseInt(arr[1]);
                Integer eng = Integer.parseInt(arr[2]);
                Integer math = Integer.parseInt(arr[3]);

                System.out.println("총점 : " + (kor + eng + math));
                double avg = (kor + eng + math) / 3.0;
                System.out.println("평균 : " +(Math.round(avg)));
                if (avg >= 90) {
                    System.out.println("학점 : " + " A ");
                } else if (avg >= 80) {
                    System.out.println("학점 : " + " B ");
                } else if (avg >= 70) {
                    System.out.println("학점 : " + " C ");
                } else if (avg >= 60) {

                } else {
                    System.out.println("학점 : F" + " (재시험😢)");
                }
                System.out.println("---------------------------------");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}