import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        String file1 = "data.txt";
        Scanner sc;
        int score;

        System.out.println("*********성적 프로그램*********");

        try {
            sc = new Scanner(new FileInputStream(file1));

            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] input1 = str.split(",");

                System.out.println("이름: " + input1[0]); //
                System.out.println("국어점수: " + input1[1]);
                System.out.println("영어점수: " + input1[2]);
                System.out.println("수학점수: " + input1[3]);
                System.out.println("총점 : " + (Integer.parseInt(input1[1]) +
                        Integer.parseInt(input1[2]) + Integer.parseInt(input1[3])));
                System.out.println("평균 : " + (Integer.parseInt(input1[1]) +
                        Integer.parseInt(input1[2]) + Integer.parseInt(input1[3])) / 3);

                System.out.print("학점 : ");
                score = ((Integer.parseInt(input1[1]) +
                        Integer.parseInt(input1[2]) + Integer.parseInt(input1[3])) / 3);
                switch (score / 10) {
                    case 10:
                    case 9:
                        System.out.println("A");
                        break;
                    case 8:
                        System.out.println("B");
                        break;
                    case 7:
                        System.out.println("C");
                        break;
                    case 6:
                        System.out.println("D");
                        break;
                    default:
                        System.out.println("F입니다.....");
                }
                System.out.println();
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
