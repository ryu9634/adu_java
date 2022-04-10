import java.util.Scanner;

public class Oop5 {
    public static void main(String[] args) {
        // 등록 안내 문구
        System.out.println("몇 명의 학생을 등록할까요?");

        // 객체 배열 생성, 요소갯수는 받아서 처리함
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Student[] students= new Student[num];


        // 각각 점수, 이름 입력 받으면서 객체 생성함
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+"번째 학생의 번호를 입력하세요");
            int no=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
            String name=sc.next();
            System.out.println((i+1)+"번째 학생의 국어점수를 입력하세요");
            int kor=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 수학점수를 입력하세요");
            int math=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 영어점수를 입력하세요");
            int eng=sc.nextInt();
            students[i]=new Student(no, name, kor, math, eng);
        }

        // 번호, 이름, 점수 출력
        for(Student a: students){
            System.out.println(a);
        }

    }
}
