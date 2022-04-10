import java.util.Scanner;

public class Homework_Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 명의 학생을 등록할까요?");
        int num = sc.nextInt();
        Student[] students = new Student[num];

        for(int i = 0; i < num;i++){
            students[i] = new Student();
            System.out.println(i+1 +  "번째 학생의 번호를 입력하세요");
            students[i].setNo(sc.nextInt());
            System.out.println(i+1 +  "번째 학생의 이름을 입력하세요");
            students[i].setName(sc.next());
            System.out.println(i+1 +  "번째 학생의 국어점수를 입력하세요");
            students[i].setKor(sc.nextInt());
            System.out.println(i+1 +  "번째 학생의 영어점수를 입력하세요");
            students[i].setEng(sc.nextInt());
            System.out.println(i+1 +  "번째 학생의 수학점수를 입력하세요");
            students[i].setMath(sc.nextInt());
            students[i] = new Student(students[i].getNo(), students[i].getName(),
                    students[i].getKor(),students[i].getMath(),students[i].getEng(),
                    students[i].getTot(),students[i].getAvg());
        }

        for(Student student1  : students){
                System.out.println(student1);
        }

    }
}
