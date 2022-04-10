import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;


public class homework2 {
    public static void main(String[] args) {
        String input = "D:\\gowoon\\java\\homework10\\data.txt";
        Scanner sc;
        try {

            FileReader fr = new FileReader(input);
            sc = new Scanner(new FileInputStream("data.txt"));
            int r;
            while ((r = fr.read()) != -1){
                String nl = sc.nextLine();
                String[] arr = nl.split(",");
                System.out.println("이름 :" + arr[0]);
                System.out.println("국어점수 :" + arr[1]);
                System.out.println("영어점수 :" + arr[2]);
                System.out.println("수학점수 :" + arr[3]);
                int sum = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
                System.out.println("총점 : " + sum);
                double avg = sum / 3.0;
                System.out.println("평균 : " + avg);
                String grade = "F";
                if(avg >= 90){
                    grade = "A";
                }else if(avg >= 80){
                    grade = "B";
                }else if(avg >= 70){
                    grade = "C";
                }else if(avg >= 60){
                    grade = "D";
                }
                System.out.println("학점 : " + grade);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

