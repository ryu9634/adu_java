import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록할까요?");

        int stu = sc.nextInt();
        Homework2[] students = new Homework2[stu];


        for (int i = 0; i < stu; i++) {

            System.out.println(i + 1 + "번째 학생의 번호를 입력하세요");
            int no = sc.nextInt();

            System.out.println(i + 1 + "번째 학생의 이름을 입력하세요");
            String name = sc.next();

            System.out.println(i + 1 + "번째 학생의 국어점수를 입력하세요");
            int kor = sc.nextInt();

            System.out.println(i + 1 + "번째 학생의 수학점수를 입력하세요");
            int math = sc.nextInt();

            System.out.println(i + 1 + "번째 학생의 영어점수를 입력하세요");
            int eng = sc.nextInt();
        }
        for (Homework2 result : students) {
            System.out.println(result);
        }
    }
}
