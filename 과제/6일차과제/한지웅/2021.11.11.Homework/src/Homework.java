import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("몇명의 학생을 등록할까요?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번째 학생의 번호");
            System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
            String name=sc.next();
            System.out.println((i+1)+"번째 학생의 국어점수를 입력하세요");
            int kor=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 수학점수를 입력하세요");
            int math=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 영어점수를 입력하세요");
            int eng=sc.nextInt();
            System.out.println((i+1)+"번째 학생의 총합점수 : " + ((kor) + (math) + (eng)));
            int tot=sc.nextInt();
            students[i]=new Student(num, name, kor, math, eng);



        }






    }
}
