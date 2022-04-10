import java.util.Scanner;

class Student1 {
    private int num;
    private String name;
    private int kor;
    private int math;
    private int eng;

    public Student1(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        int tot = kor + math + eng;
        double avg = tot / 3.0;
        return "Student{" + "num=" + num + ", name='" + name + '\'' + ", kor=" + kor + ", eng=" + eng + ", math=" + math +  ", tot="  + tot +  ", avg="  + avg + '}';
    }
}

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록할까요?" + " ");
        int s_no = sc.nextInt();
        Student1[] students = new Student1[s_no];
        for (int i = 0; i < s_no; i++) {
            System.out.print(i + 1 +  "번째 학생의 번호를 입력하세요" + " ");
            students[i] = new Student1(sc.nextInt());
            System.out.print(i + 1 +  "번째 학생의 이름을 입력하세요" + " ");
            students[i].setName(sc.next());
            System.out.print(i + 1 +  "번째 학생의 국어점수를 입력하세요" + " ");
            students[i].setKor(sc.nextInt());
            System.out.print(i + 1 +  "번째 학생의 영어점수를 입력하세요" + " ");
            students[i].setEng(sc.nextInt());
            System.out.print(i + 1 +  "번째 학생의 수학점수를 입력하세요" + " ");
            students[i].setMath(sc.nextInt());

            System.out.println(" ");
        }

        for (Student1 students1 : students)
            System.out.println(students1.toString());
    }
}
