import java.util.Scanner;

/*
방금전에 만든 Student 클래스를 활용하여 아래와 같은 프로그램을 작성해보자.
(단, 생성자를 꼭 사용함.)

몇명의 학생을 등록할까요? 5
1번째 학생의 번호를 입력하세요. 1
1번째 학생의 이름를 입력하세요. 김사과
1번째 학생의 국어점수를 입력하세요. 90
1번째 학생의 수학점수를 입력하세요. 90
1번째 학생의 영어점수를 입력하세요. 90
...
4번째 학생의 번호를 입력하세요. 4
4번째 학생의 이름를 입력하세요. 오렌지
4번째 학생의 국어점수를 입력하세요. 90
4번째 학생의 수학점수를 입력하세요. 90
4번째 학생의 영어점수를 입력하세요. 90

결과
Student{no=1, name='김사과', kor=0, math=0, eng=0, tot=240, avg=80}
Student{no=2, name='김사과', kor=0, math=0, eng=0, tot=240, avg=80}
Student{no=3, name='김사과', kor=0, math=0, eng=0, tot=240, avg=80}
Student{no=4, name='김사과', kor=0, math=0, eng=0, tot=240, avg=80}

 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int student_num;
        do{
            System.out.print("몇명의 학생을 등록하겠습니까? >>> ");
            student_num = sc.nextInt();
            if (student_num == 0){
                System.out.println("1이상의 숫자로 다시 입력하세요.");
            }else{
                t++;
            }
        }while (t==0);
        System.out.println("");

        HomeWork_Student[] students = new HomeWork_Student[student_num];        // 배열생성

        for (int i = 0; i < student_num; i++) {
            // 객체 생성 및 초기화
            students[i] = new HomeWork_Student(0,"no data",0,0,0,0,0.0);

            // 객체 내 data 입력
            System.out.print((i+1)+"번째 학생의 번호를 입력하세요 >>> ");students[i].setNo(sc.nextInt());
            System.out.print((i+1)+"번째 학생의 이름를 입력하세요 >>> ");students[i].setName(sc.next());
            System.out.print((i+1)+"번째 학생의 국어점수를 입력하세요 >>> "); students[i].setKor(sc.nextInt());
            System.out.print((i+1)+"번째 학생의 수학점수를 입력하세요 >>> ");students[i].setMath(sc.nextInt());
            System.out.print((i+1)+"번째 학생의 영어점수를 입력하세요 >>> ");students[i].setEng(sc.nextInt());
            System.out.println("-----------------------------------------------");
            students[i].setTot(students[i].getKor()+students[i].getMath()+students[i].getEng());
            students[i].setAvg((double)students[i].getTot()/(3));

            // 객체 재생성 및 생성자에 값 입력
            students[i] = new HomeWork_Student(students[i].getNo(),students[i].getName(),students[i].getKor(),
                    students[i].getMath(),students[i].getEng(),students[i].getTot(),students[i].getAvg());
        }

        for (int i = 0; i < student_num; i++) {                                   // 출력
            System.out.println(students[i].toString());
        }
    }
}
