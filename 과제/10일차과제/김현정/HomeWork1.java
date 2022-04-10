import java.io.*;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        String dataIn;
        int kor, eng, math, total;
        double avg;
        String name;

        try {
            Scanner sc = new Scanner(new FileInputStream("data.txt"));

            System.out.println("********** 성적 프로그램 **********");
            while (sc.hasNextLine()) {
                dataIn = sc.nextLine();
                String[] outData = dataIn.split(",");
                name = outData[0];
                kor = Integer.parseInt(outData[1]);
                eng = Integer.parseInt(outData[2]);
                math = Integer.parseInt(outData[3]);
                total = kor + eng + math;
                avg = total/3;

                System.out.println("이름 : " + name);
                System.out.println("국어점수 : " + kor);
                System.out.println("영어점수 : " + eng);
                System.out.println("수학점수 : " + math);
                System.out.println("총점 : " + total);
                System.out.println("평균 : " + avg);
                if(avg >= 90) {
                    System.out.println("학점 : A ");
                }else if(avg >=80 && avg < 90){
                    System.out.println("학점 : B ");
                }else if(avg >=70 && avg < 80){
                    System.out.println("학점 : C ");
                }else if(avg >=60 && avg < 70){
                    System.out.println("학점 : D ");
                } else if(avg >=0 && avg < 60){
                    System.out.println("학점 : F ");
                }

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
