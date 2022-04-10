import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("몇명의 학생들을 등록할까요???");
        int students= sc.nextInt();
        Homework2 homework2[]=new Homework2[students];

        for (int i=0; i< students; i++){
            homework2[i]=new Homework2();
            System.out.println((i+1)+"번째 학생의 번호를 입력하세요");
            homework2[i].setNo(sc.nextInt());
            System.out.println((i+1)+"학생의 이름을 입력하세요");
            homework2[i].setName(sc.next());
            System.out.println((i+1)+"학생의 국어점수를 입력하세요");
            homework2[i].setKor(sc.nextInt());
            System.out.println((i+1)+"학생의 수학점수를 입력하세요");
            homework2[i].setMath(sc.nextInt());
            System.out.println((i+1)+"학생의 영어점수를 입력하세요");
            homework2[i].setEng(sc.nextInt());
        }

        for(Homework2 homework21:homework2){
            System.out.println(homework21);
        }

    }
}
