import java.util.Scanner;

public class Oop4 {
    public static void main(String[] args) {
        /*
        과제.
Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자.
(단, 생성자를 꼭 사용함)
몇 명의 학생을 등록할까요? 4
1번째 학생의 번호를 입력하세요. 1
1번째 학생의 이름을 입력하세요. 김사과
1번째 학생의 국어점수를 입력하세요. 90
1번째 학생의 영어점수를 입력하세요. 80
1번째 학생의 수학점수를 입력하세요. 70
2번째 학생의 번호를 입력하세요. 2
...
4번째 학생의 수학점수를 입력하세요. 60

결과
Student{no=1, name='김사과', kor=90, math=70, eng=80, tot=240, avg=80}
...
Student{no=4, name='오렌지', kor=90, math=70, eng=80, tot=240, avg=80}
         */
        System.out.println("몇 명의 학생을 등록할까요?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Student[] students = new Student[num];


        for(int i=0; i<num;i++){
            System.out.println(i+1+"번째 학생의 번호를 입력하세요");
            int no = sc.nextInt();

            System.out.println(i+1+"번째 학생의 이름을 입력하세요");
            String name = sc.next();

            System.out.println(i+1+"번째 학생의 국어점수를 입력하세요");
            int kor=sc.nextInt();

            System.out.println(i+1+"번째 학생의 수학점수를 입력하세요");
            int math = sc.nextInt();

            System.out.println(i+1+"번째 학생의 영어점수를 입력하세요");
            int eng = sc.nextInt();
            students[i]=new Student(no,name,kor,math,eng);
        }
        for(Student a: students){
            System.out.println(a);
        }
    }


}
