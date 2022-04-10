/*
    Student 클래스를 활용하여 아래와 같은 프로그램을 작성
    (단, 생성자를 꼭 사용함)

    결과
    몇명의 학생을 등록할까요? 4
    1번째 학생의 번호 :
    1번째 학생의 이름 :
    1번째 학생의 국어점수 :
    1번째 학생의 영어점수 :
    1번째 학생의 수학점수 :
    2번째 학생의 번호 :
    ....
    4번째 학생의 수학점수 :

    Student{num=1, name='김사과', kor=90, eng=80, math=70, tot=240, avg=80}
    ...
*/

import java.util.Scanner;

public class Day6Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수 : ");
        int studentNum = sc.nextInt();

        Day6Homework1Student[] students = new Day6Homework1Student[studentNum];


        for (int i = 0; i < students.length; i++) {
            students[i] = new Day6Homework1Student();
            System.out.print("학생 번호 : ");
            students[i].setNum(sc.nextInt());
            System.out.print(students[i].getNum() + "번째의 학생 이름 : ");
            students[i].setName(sc.next());
            System.out.print(students[i].getNum() + "번째의 학생의 국어점수 : ");
            students[i].setKor(sc.nextInt());
            System.out.print(students[i].getNum() + "번째의 학생의 영어점수 : ");
            students[i].setEng(sc.nextInt());
            System.out.print(students[i].getNum() + "번째의 학생의 수학점수 : ");
            students[i].setMath(sc.nextInt());
            students[i] = new Day6Homework1Student(students[i].getNum(), students[i].getName(), students[i].getKor(), students[i].getEng(), students[i].getMath());

        }

        for (Day6Homework1Student student : students) {
            System.out.println(student);
        }
    }
}
