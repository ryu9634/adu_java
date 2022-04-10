import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇명의 학생을 등록할까요?");
        int students = sc.nextInt();
        Student grade[] = new Student[students];

        for (int i = 0; i < students; i++){
            grade[i] = new Student();
            System.out.println((i + 1) + "번째 학생의 번호를 입력하세요. ");
            grade[i].setNo(sc.nextInt());
            System.out.println((i + 1) + "번째 학생의 이름를 입력하세요. ");
            grade[i].setName(sc.next());
            System.out.println((i + 1) + "번째 학생의 국어점수를 입력하세요. ");
            grade[i].setKor(sc.nextInt());
            System.out.println((i + 1) + "번째 학생의 영어점수를 입력하세요. ");
            grade[i].setEng(sc.nextInt());
            System.out.println((i+ 1 ) + "번째 학생의 수학점수를 입력하세요. ");
            grade[i].setMath(sc.nextInt());
        }
        for(Student grade1 : grade) {
            System.out.println(grade1);
        }

    }
}
