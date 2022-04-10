/*
과제.
Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자.
(단, 생성자를 꼭! 사용함)
몇명의 학생을 등록할까요?
1번째 학생의 번호를 입력하세요
1번째 학생의 이름을 입력하세요.
1번째 학생의 국어점수를 입력하세요.
1번째 학생의 영어점수를 입력하세요.
1번째 학생의 수학점수를 입력하세요.
 */

import java.util.Scanner;

public class day06HomeWork1 {
    private int no;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private int tot;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇명을 학생을 등록해야하나요");
        int student = sc.nextInt();

        for (int i = 1 ; i < student; i++){
            System.out.println("번째 학생의 번호 등록 :");
            System.out.println("번째 학생의 이름 등록 :");
            System.out.println("번째 학생의 국어점수 등록:");
            System.out.println("번째 학생의 수학점수 등록:");
            System.out.println("번째 학생의 영어점수 등록:");
            System.out.println("번째 학생의 총합점수 등록:");

          for (day06HomeWork1 students);{
              System.out.println(student);
          }

        }

    }

}

