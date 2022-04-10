import java.util.ArrayList;
import java.util.Scanner;

/*
과제2.
학생 관리 프로그램을 만들어보자

결과
메뉴를 선택하세요
1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료
1
학번을 입력하세요
반을 입력하세요
이름을 입력하세요
나이를 입력하세요
연락처를 입력하세요

2
toString

3
검색할 학번을 입력하세요
학번 입력
toString
만약 찾지 못했을 경우 -> " 찾는학생의 정보가 없습니다. "

4.
삭제할 학생의 학번을 입력하세요
입력
"삭제되었습니다."

5
수정할 학생의 학번을 입력하세요
학번을 입력하세요
반을 입력하세요
이름을 입력하세요
나이를 입력하세요
연락처를 입력하세요

수정되었습니다.

6
프로그램종료
 */
public class HomeWork2 {
    /*
    결과
메뉴를 선택하세요
1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료
1
학번을 입력하세요
반을 입력하세요
이름을 입력하세요
나이를 입력하세요
연락처를 입력하세요
     */
    public static void main(String[] args) {
        HomeWork_2 hw2 = new HomeWork_2();
        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다.\n메뉴를 선택하세요");

        int studentNo, old;
        String className, name, phone;
        ArrayList<HomeWork_2> List = new ArrayList<>();
        HomeWork_2 studentList;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 검색 4. 삭제 5. 수정 6. 종료");
            int menu = sc.nextInt();

            if (menu == 6) break;
            switch (menu) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    studentNo = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    className = sc.next();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    old = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phone = sc.next();
                    studentList = new HomeWork_2(studentNo, className, name, old, phone);

                    List.add(studentList);
                    break;
                case 2:
                    for (int i = 0; i < List.size(); i++) {
                        System.out.println(List.get(i));
                    }
                    break;
                case 3:
                    System.out.println("찾고자 하는 학생의 학번을 입력하세요");
                    int No = sc.nextInt();
                    boolean isNo = false;
                    for (int i = 0; i < List.size(); i++) {
                        if (List.get(i).getStudentNo() == No) {
                            System.out.println("결과");
                            System.out.println(List.get(i));
                            isNo = true;
                        }
                    }
                    if (!isNo) {
                        System.out.println("찾으시는 학생은 없습니다.");
                    }break;
                case 4:
                    System.out.println("삭제하고자 하는 학생의 학번을 입력하세요");
                    int No1 = sc.nextInt();
                    boolean isNo1 = false;
                    for (int i = 0; i < List.size(); i++) {
                        if (List.get(i).getStudentNo() == No1) {
                            List.remove(i);
                            System.out.println("삭제되었습니다.");
                            isNo1 = true;
                        }
                    }
                    if (!isNo1) {
                        System.out.println("찾으시는 학생은 없습니다.");
                    }break;
                case 5:
                    System.out.println("정보 수정을 원하는 학생의 학번을 입력하세요");
                    int No2 = sc.nextInt();
                    boolean isNo2 = false;
                    for (int i = 0; i < List.size(); i++) {
                        if (List.get(i).getStudentNo() == No2) {

                            System.out.println("변경할 학번을 입력하세요");
                            studentNo = sc.nextInt();
                            System.out.println("변경할 반을 입력하세요");
                            className = sc.next();
                            System.out.println("변경할 이름을 입력하세요");
                            name = sc.next();
                            System.out.println("변경할 나이를 입력하세요");
                            old = sc.nextInt();
                            System.out.println("변경할 연락처를 입력하세요");
                            phone = sc.next();
                            studentList = new HomeWork_2(studentNo, className, name, old, phone);

                            List.set(i,studentList) ;


                            isNo2 = true;
                        }
                    }
                    if (!isNo2) {
                        System.out.println("찾으시는 학생은 없습니다.");
                    }

            }

        }
        System.out.println("프로그램 종료");
    }

}
