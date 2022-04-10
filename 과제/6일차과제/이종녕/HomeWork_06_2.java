import java.util.Scanner;

public class HomeWork_06_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명의 학생의 정보를 기입 하시겠습니까?");

        int num1 = sc.nextInt();
        Student[] students = new Student[num1];

        for (int i = 0; i < num1; i++) {

            students[i] = new Student(0, "noname", 0, 0, 0, 0, 0.0);
            System.out.println("번호를 입력해 주세요");
            students[i].setNo(sc.nextInt());

            System.out.println(i + 1 + "번 째 사람의 이름을 입력해주세요");
            students[i].setName(sc.next());

            System.out.println(i + 1 + "번 째 사람의 국어점수를 입력해주세요.");
            students[i].setKor(sc.nextInt());

            System.out.println(i + 1 + "번 째 사람의 수학점수를 입력해주세요.");
            students[i].setMath(sc.nextInt());

            System.out.println(i + 1 + "번 째 사람의 영어점수를 입력해주세요.");
            students[i].setEng(sc.nextInt());

            students[i].setTotal(students[i].getEng() + students[i].getMath() + students[i].getKor());
            students[i].setAvg(students[i].getTotal() / 3);
        }
        for (int i = 0; i <num1 ; i++) {
            System.out.println(students[i]);

        }

    }
}
