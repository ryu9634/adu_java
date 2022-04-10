import java.io.FileInputStream;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        String data = "/Users/kimhyunwoo/IdeaProjects/Day10/Homework.txt";
        String score;
        int kor, math, eng, total;
        double avg;
        String name;

        try{
            Scanner sc = new Scanner(new FileInputStream(data));
            System.out.println("********** 성적 프로그램 **********");
            while (sc.hasNextLine()) {
                score = sc.nextLine();
                String[] outData = score.split(",");
                name = outData[0];
                kor = Integer.parseInt(outData[1]);
                math = Integer.parseInt(outData[2]);
                eng = Integer.parseInt(outData[3]);
                total = kor + math + eng;
                avg = total / 3;

                System.out.println("이름: " + name);
                System.out.println("국어점수: " + kor);
                System.out.println("수학점수: " + math);
                System.out.println("영어점수: " + eng);
                System.out.println("총점: " + total);
                System.out.println("평균: " + (int) avg);
                System.out.print("학점: ");
                System.out.println
                        (avg >= 90 ? "A" :
                                avg >= 80 ? "B" :
                                        avg >= 70 ? "C"
                                                : avg >= 60 ? "D" : "F");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}