import java.io.FileInputStream;
import java.util.Scanner;

public class homework1_day10 {
    public static void main(String[] args) {
        Scanner sc;

        try {
            sc = new Scanner(new FileInputStream("data.txt"));
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                String[] arr=str.split(",");
                System.out.println("이름: "+ arr[0]);
                System.out.println("국어점수: "+arr[1]);
                System.out.println("수학점수: "+arr[2]);
                System.out.println("영어점수: "+arr[3]);
                int sum=Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]);
                System.out.println("총점: "+ sum);
                int avg=sum/3;
                System.out.println("평균: "+ avg);
                String grade;
                switch (avg/10){
                    case 10: case 9:
                        grade="A";
                        System.out.println("학점: "+grade);
                    case 8:
                        grade = "B";
                        System.out.println("학점 : "+grade);
                        break;
                    case 7:
                        grade = "C";
                        System.out.println("학점 : "+grade);
                        break;
                    case 6:
                        grade = "D";
                        System.out.println("학점 : "+grade);
                        break;
                    default:
                        grade = "F";
                        System.out.println("학점 : "+grade);
                        break;
                }

            }
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
