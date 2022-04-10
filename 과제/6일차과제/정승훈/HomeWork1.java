import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록할까요?");
        int member = sc.nextInt();
        School[] schools = new School[member];

        for (int i = 0; i < member; i++) {
            schools[i] = new School(0, " ", 0, 0, 0, 0, 0.0);
            System.out.println(i + 1 + "번째 학생의 번호를 입력하세요.");
            schools[i].setNum(sc.nextInt());
            System.out.println(i + 1 + "번째 학생의 이름을 입력하세요.");
            schools[i].setName(sc.next());
            System.out.println(i + 1 + "번째 학생의 국어점수를 입력하세요.");
            schools[i].setKor(sc.nextInt());
            System.out.println(i + 1 + "번째 학생의 영어점수를 입력하세요.");
            schools[i].setEng(sc.nextInt());
            System.out.println(i + 1 + "번째 학생의 수학점수를 입력하세요.");
            schools[i].setMath(sc.nextInt());

            schools[i].setTotal(schools[i].getKor() + schools[i].getEng() + schools[i].getMath());
            schools[i].setAvg(schools[i].getTotal() / 3);

        }
        for (int i = 0; i < member; i++) {
            System.out.println(schools[i]);
        }
    }
}
