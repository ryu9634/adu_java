/*
과제.
Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자
(단, 생성자를 꼭 사용하여 만들어보시오)
몇몇의 학생을 등록할까요?
1번째 학생의 번호를 등록하세요.
1번째 학생의 이름을 입력하세요.
1번째 학생의 국어점수를 입력하세요.
1번째 학생의 영어점수를 입력하세요.
1번째 학생의 수학점수를 입력하세요.
2번째...
....
n번째 학생의 수학점수를 입력하세요.
-끝-

결과
student{no=2, name='류승표', kor=0, math=0, eng=0, tot =0 , avg = 0}
....

 */

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇몇의 학생을 등록할까요?");
        int Total = sc.nextInt();

        Student[] students = new Student[Total];

        for (int i = 0; i <= Total - 1; i++) {

            System.out.println((i + 1) + "번째 학생의 번호를 등록하세요");
            int no = sc.nextInt();
            System.out.println((i + 1) + "번째 학생의 이름를 등록하세요");
            String name = sc.next();
            System.out.println((i + 1) + "번째 학생의 국어점수를 등록하세요");
            int kor = sc.nextInt();
            System.out.println((i + 1) + "번째 학생의 수학점수를 등록하세요");
            int math = sc.nextInt();
            System.out.println((i + 1) + "번째 학생의 영어점수를 등록하세요");
            int eng = sc.nextInt();
            int tot = kor + math + eng;
            int div = (kor + math + eng)/3;
            students[i] = new Student(no, name, kor, math, eng,tot,div);
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}














