import java.util.Scanner;

public class HomeWork_06_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("몇 명의 인원을 기입 하시겠습니까?");
        int person = sc.nextInt();
        Student[] students = new Student[person];

        for (int i = 0; i <person; i++) {

            students[i] =new Student(0 ,"unknown",0,0,0,0,0.0);
            System.out.println(i+1+"번 째 사람의 번호를 입력해주세요.");
            int num = sc.nextInt();
            students[i].setNo(num);

            System.out.println(i+1+"번 째 사람의 이름을 입력해주세요");
            String name = sc.next();
            students[i].setName(name);

            System.out.println(i+1+"번 째 사람의 국어점수를 입력해주세요.");
            int num1 = sc.nextInt();
            students[i].setKor(num1);

            System.out.println(i+1+"번 째 사람의 수학점수를 입력해주세요.");
            int num2 = sc.nextInt();
            students[i].setMath(num2);

            System.out.println(i+1+"번 째 사람의 영어점수를 입력해주세요.");
            int num3 = sc.nextInt();
            students[i].setEng(num3);

            int total = num1+num2+num3;
            students[i].setTotal(total);

            double total1 = (num1+num2+num3)/3;
            students[i].setAvg(total1);


        }
        for (int i = 0; i < person; i++) {
            System.out.println(students[i]);
        }












    }





}
