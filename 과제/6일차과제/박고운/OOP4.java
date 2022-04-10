import java.util.Scanner;

/*
Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자.
(단, 생성자를 꼭! 사용함)
        1번째 학생의 번호를 입력하세요. 1
        1번째 학생의 이름을 입력하세요. 김사과
        1번째의 학생의 국어점수를 입력하세요. 90
        1번째 학생의 영어점수를 입력하세요. 80
        1번째 학생의 수학점수를 입력하세요. 70
        2번째 학생의 번호를 입력하세요. 2
        ...
        4번째 학생의 수학점수를 입력하세요 60

        결과
        Student{no=1, name='반하나', kor=0, math=0, eng=0, tot=240, avg=80}
 */
public class OOP4 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("몇 명의 학생을 등록할까요? ");
    int n = sc.nextInt();

    Student[] students = new Student[n];

    for(int i = 0; i< n; i++){
        students[i] = new Student();
        System.out.print((i+1) + "번째 학생의 번호를 입력하세요 : ");
        int no = sc.nextInt();
        students[i].setNo(no);

        System.out.print((i+1) + "번째 학생의 이름를 입력하세요 : ");
        String name = sc.next();
        students[i].setName(name);

        System.out.print((i+1) + "번째 학생의 국어점수를 입력하세요 : ");
        int kor = sc.nextInt();
        students[i].setKor(kor);

        System.out.print((i+1) + "번째 학생의 영어점수를 입력하세요 : ");
        int eng = sc.nextInt();
        students[i].setEng(eng);

        System.out.print((i+1) + "번째 학생의 수학점수를 입력하세요 : ");
        int math = sc.nextInt();
        students[i].setMath(math);
    }

    for(Student st : students){
        st.info();
        System.out.println();
    }

}
}
