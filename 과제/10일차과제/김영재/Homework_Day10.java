import java.io.FileInputStream;
import java.util.Scanner;

public class Homework_Day10 {
    public static void main(String[] args) {
        String file1 = "data.txt";
        Scanner sc ;

    try {
        sc = new Scanner(new FileInputStream(file1));
        System.out.println("********** 성적 확인 프로그램 **********");
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(",");
            System.out.println("이름 : " + arr[0]);
            System.out.println("국어점수 : " + arr[1]);
            System.out.println("영어점수 : " + arr[2]);
            System.out.println("수학점수 : " + arr[3]);
            int tot = Integer.parseInt(arr[1]) +Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
            System.out.println("총점 : " + tot);
            int avg = tot / 3;
            System.out.println("평균 : " + avg);
            if(avg>=90 && avg<=100) {
                System.out.println("학점 : A학점");
            }else if (avg>=80) {
                System.out.println("학점 : B학점");
            }else if (avg>=70) {
                System.out.println("학점 : C학점");
            }else if (avg>=60) {
                System.out.println("학점 : D학점");
            }else System.out.println("학점 : F학점");
            System.out.println();
        }
    }catch (Exception e){
            e.printStackTrace();
        }
    }
}
