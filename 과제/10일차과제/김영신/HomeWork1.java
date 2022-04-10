import java.io.FileInputStream;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        String data = "E:/Epstein/Java/Day10/data.txt"; // data.txt;
        String dataIn;
        int langScore, mathScore, engScore, totalScore;
        double avgScore;
        String name;

        try {
            Scanner sc = new Scanner(new FileInputStream(data));

            System.out.println("********** 성적 프로그램 **********");
            while (sc.hasNextLine()) {
                dataIn = sc.nextLine();
                String[] outData = dataIn.split(",");
                name = outData[0];
                langScore = Integer.parseInt(outData[1]);
                engScore = Integer.parseInt(outData[2]);
                mathScore = Integer.parseInt(outData[3]);
                totalScore = langScore + engScore + mathScore;
                avgScore = totalScore / (double) 3;

                System.out.println("이름 : " + name);
                System.out.println("국어점수 : " + langScore);
                System.out.println("영어점수 : " + engScore);
                System.out.println("수학점수 : " + mathScore);
                System.out.println("총점 : " + totalScore);
                System.out.println("평균 : " + (int) avgScore);
                System.out.print("학점 : ");
                System.out.println
                        (avgScore >= 90 ? "A" :
                                avgScore >= 80 ? "B" :
                                        avgScore >= 70 ? "C"
                                                : avgScore >= 60 ? "D" : "F");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

