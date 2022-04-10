/*과제2.
        학생 관리 프로그램을 만들어보자.

        결과
        메뉴를 선택하세요.
        1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료
        1
        학번을 입력하세요
        반을 입력하세요
        이름을 입력하세요
        나이를 입력하세요
        연락처를 입력하세요
        2
        학번 : 10000
        반: 1
        아름 : 김사과
        나이 : 20
        연락처 : 010-1111-1253
        3
        검색할 학생의 학번을 입력하세요
        10000
        학번 : 10000
        반: 1
        아름 : 김사과
        나이 : 20
        연락처 : 010-1111-1253
        ✔ 만약 찾지 못했을 경우 -> "찾는 학생의 정보가 없습니다"
        4
        삭제할 학생의 학번을 입력하세요
        10000
        삭제되었습니다!
        5
        수정할 학생의 학번을 입력하세요
        10000
        반을 입력하세요
        이름을 입력하세요
        나이를 입력하세요
        연락처를 입력하세요
        수정되었습니다*/

import java.util.ArrayList;
import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[학생 관리 프로그램]");


        int no, cla, age, find;
        String name, phone;
        ArrayList<StuInfo> arrayS = new ArrayList();
        StuInfo s;

        while (true) {
            System.out.println("메뉴를 선택하고 숫자를 입력하세요");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            no = sc.nextInt();
            if (no == 6) break;
            switch (no) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    no = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    cla = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phone = sc.next();

                    s = new StuInfo(no, cla, name, age, phone);
                    arrayS.add(s);
                    break;
                case 2:
                    for (int i = 0; i < arrayS.size(); i++) {
                        System.out.println(arrayS.get(i));
                    }
                    break;
                case 3:
                    System.out.println("학번을 입력하면 학생의 정보를 찾습니다.");
                    find = sc.nextInt();
                    boolean isFind = false;
                    for (int i = 0; i < arrayS.size(); i++) {
                        if (arrayS.get(i).getNo() == find) {
                            System.out.println(arrayS.get(i));
                            isFind = true;
                        }
                    }
                    if (isFind == false) {
                        System.out.println("해당 학번으로 등록된 정보가 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("삭제할 학생의 학번을 입력하세요.");
                    find = sc.nextInt();
                    for (int i = 0; i < arrayS.size(); i++) {
                        if (arrayS.get(i).getNo() == find) {
                            arrayS.remove(i);
                            System.out.println("삭제완료.");
                        }

                    }
                    break;
                case 5:
                    System.out.println("수정할 학번을 입력하세요.");
                    find = sc.nextInt();
                    for (int i = 0; i < arrayS.size(); i++) {
                        if (arrayS.get(i).getNo() == find) {
                            System.out.println("학번을 입력하세요");
                            no = sc.nextInt();
                            System.out.println("반을 입력하세요");
                            cla = sc.nextInt();
                            System.out.println("이름을 입력하세요");
                            name = sc.next();
                            System.out.println("나이를 입력하세요");
                            age = sc.nextInt();
                            System.out.println("연락처를 입력하세요");
                            phone = sc.next();
                            s = new StuInfo(no, cla, name, age, phone);
                            arrayS.set(i, s);
                        }

                    }
                    break;
            }
        }
    }
}

