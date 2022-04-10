/*
과제 1. Studunt Class를 활용하여 아래와 같은 프로그램을 작성해보자
        (단, 생성자를 꼭 사용함)
        몇 명의 학생을 등록할까요? → 입력한 숫자만큼 작성
        1번째 학생의 번호를 입력하세요.       1번
        1번째 학생의 이름을 입력하세요.       김사과
        1번째 학생의 국어점수을 입력하세요.     90
        1번째 학생의 영어점수을 입력하세요.     70
        1번째 학생의 수학점수을 입력하세요.     80

        .......

        결과 : Student{no=1, name='반하나', kor=0, math=0, eng=0, tot=240, avg=80}
 */

import java.util.Scanner;

public class Oop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 숫자를 입력하세요 : ");
        int su = sc.nextInt();

        Student[] students = new Student[su];

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student(0,"no data",0,0,0,0,0);

            System.out.print((i + 1) + "번째의 학생의 번호를 입력하세요. : ");
            students[i].setNo(sc.nextInt());

            System.out.print((i + 1) + "번째의 학생의 이름을 입력하세요. : ");
            students[i].setName(sc.next());

            System.out.print((i + 1) + "번째의 학생의 국어점수을 입력하세요. : ");
            students[i].setKor(sc.nextInt());

            System.out.print((i + 1) + "번째의 학생의 영어점수을 입력하세요. : ");
            students[i].setEng(sc.nextInt());

            System.out.print((i + 1) + "번째의 학생의 수학점수을 입력하세요. : ");
            students[i].setMath(sc.nextInt());

            students[i].setTot(students[i].getKor() + students[i].getEng() + students[i].getMath());
            students[i].setAvg(students[i].getTot() / 3);

        }

        for (Student student1 : students) {
            System.out.println(student1.toString());
        }
    }
}
