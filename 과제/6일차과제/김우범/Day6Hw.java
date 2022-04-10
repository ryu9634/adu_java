/*
과제.
        Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자.
        (단, 생성자를 꼭! 사용함)
        1번째 학생의 번호를 입력하세요. 1
        1번째 학생의 번호를 입력하세요. 김사과
        1번째 학생의 국어점수를 입력하새요. 90
        1번째 학생의 영어점수를 입력하새요. 80
        1번째 학생의 수학점수를 입력하새요. 70
        2번쨰 학생의 번호를 입력하세요. 2
        ...
        4번째 학생의 수학점수를 입력하세요. 60

        결과
        Student{no=1, name='김사과', kor=90, math=70, eng=80, tot=240, avg=80
        ...
        Student{no=4, name='김사과', kor=90, math=70, eng=80, tot=240, avg=80
        */

import java.util.Scanner;

public class Day6Hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 명의 학생을 등록할까요?");
        int student = sc.nextInt();

        Day6Hw2[] stu = new Day6Hw2[student];

        for (int i = 0; i < stu.length; i++){
            stu[i] = new Day6Hw2(0,0, "no data",0,0,0,0,0);
            System.out.println("학생의 번호를 입력해주세요 : ");
            stu[i].setNo(sc.nextInt());
            System.out.println("이름을 입력을 입력해 주세요 : ");
            stu[i].setName(sc.next());
            System.out.println("국어점수를 입력해 주세요 : ");
            stu[i].setKor(sc.nextInt());
            System.out.println("수학점수를 입력해 주세요 : ");
            stu[i].setMath(sc.nextInt());
            System.out.println("영어점수를 입력해 주세요 : ");
            stu[i].setEng(sc.nextInt());

        }
        for (Day6Hw2 day6Hw2 : stu)
            System.out.println(day6Hw2.toString());

    }



}



