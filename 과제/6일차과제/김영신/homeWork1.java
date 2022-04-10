import java.util.Scanner;

class Student {
    private int number;
    private String name;
    private int langScore;
    private int mathScore;
    private int engScore;
    private int totalScore;
    private double avgScore;

    public Student() {
    }      // 없애면 강의 실습간 다른 파일들의 생성자가 없어서 오류

    public Student(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }       // 없애도 되지만 다른 강의 실습간

    // 객체들에 메서드가 사라지므로 놔둠
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }        // 위와 동일

    public void setName(String name) {
        this.name = name;
    }

    public int getLangScore() {
        return langScore;
    }       // 위와 동일

    public void setLangScore(int langScore) {
        this.langScore = langScore;
    }

    public int getMathScore() {
        return mathScore;
    }       // 위와 동일

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }       // 위와 동일

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }


    @Override
    public String toString() {
        totalScore = langScore + engScore + mathScore;
        avgScore = (double) totalScore / 3;
        return "Student{" +
                "number=" + number +
                ", name = " + name +
                ", langScore = " + langScore +
                ", engScore = " + engScore +
                ", mathScore = " + mathScore +
                ", totalScore = " + totalScore +
                ", avgScore = " + avgScore +
                "}";
    }
}

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명의 학생을 등록할까요? : ");
        int inputNum = sc.nextInt();
        Student[] students = new Student[inputNum];
        for (int i = 0; i < inputNum; i++) {
            System.out.print(i + 1 + "번째 학생의 번호를 입력하세요 : ");
            students[i] = new Student(sc.nextInt());    // 생성자 이용
            System.out.print(i + 1 + "번째 학생의 이름을 입력하세요 : ");
            students[i].setName(sc.next());
            System.out.print(i + 1 + "번째 학생의 국어점수를 입력하세요 : ");
            students[i].setLangScore(sc.nextInt());
            System.out.print(i + 1 + "번째 학생의 영어점수를 입력하세요 : ");
            students[i].setEngScore(sc.nextInt());
            System.out.print(i + 1 + "번째 학생의 수학점수를 입력하세요 : ");
            students[i].setMathScore(sc.nextInt());
        }
        for (Student student : students)
            System.out.println(student.toString());

    }
}
