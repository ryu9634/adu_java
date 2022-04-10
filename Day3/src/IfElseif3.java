import java.util.Scanner;

public class IfElseif3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수를 입력하세요");
        int kor = sc.nextInt();
        System.out.println("영어점수를 입력하세요");
        int eng = sc.nextInt();
        System.out.println("수학점수를 입력하세요");
        int math = sc.nextInt();

        int tot = kor + eng + math;
        double avg = tot / 3.0;

        System.out.println("국어점수 : " + kor + "점");
        System.out.println("영어점수 : " + eng + "점");
        System.out.println("수학점수 : " + math + "점");
        System.out.println("총점 : " + tot + "점");
        System.out.println("평균 : " + avg + "점");

        if(avg >= 90){
            System.out.println("학점 : A학점");
        }else if(avg >= 80){
            System.out.println("학점 : B학점");
        }else if(avg >= 70){
            System.out.println("학점 : C학점");
        }else if(avg >= 60){
            System.out.println("학점 : D학점");
        }else{
            System.out.println("학점 : F학점");
        }
    }
}
