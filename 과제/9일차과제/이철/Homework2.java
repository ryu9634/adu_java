import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택하세요");
        System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");

        String name;
        int num, no, age, contact;
        int temp;
        Homework1 h;
        ArrayList<Homework1> list = new ArrayList<>();

        while (true) {
            temp = sc.nextInt();

            if (temp == 6) {
                break;
            }

            switch (temp) {
                case 1: // 학생등록
                    System.out.println("학번을 입력하세요");
                    num = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    no = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    contact = sc.nextInt();
                    h = new Homework1(num, no, name, age, contact);
                    list.add(h);
                    break;

                case 2: // 출력
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }

                case 3: // 검색
                    System.out.println("찾는 학생 학번을 입력하세요");
                    int find = sc.nextInt();    // 학번
                    boolean isFind = false;     // 학번을 찾았는지 여부
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum() == (find)) {
                            System.out.println("학생을 찾았습니다");
                            System.out.println(list.get(i));
                            isFind = true;
                        }
                    }
                    if (!isFind) {
                        System.out.println("찾는 학생이 없습니다");
                    }
                    break;

                case 4: //삭제
                    System.out.println("삭제하실 학생 학번을 입력하세요");
                    int del = sc.nextInt();     // 삭제할 학번
                    boolean delete = false;     // 학번을 찾았는지 여부
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum() == (del)) {
                            list.remove(i);
                            System.out.println("학생을 찾았습니다");
                            delete = true;
                        }
                    }
                    if (!delete) {
                        System.out.println("학생 정보가 없습니다");
                    }
                    break;
                case 5: //수정
                    System.out.println("수정할 학생 학번을 입력하세요");
                    int change = sc.nextInt();  // 수정할 학번
                    boolean change1 = false;    //
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum() == (change)) {
                            System.out.println("학생 : ");
                            list.get(i).setNo(sc.nextInt());
                            System.out.println("반 : ");
                            list.get(i).setName(sc.next());
                            System.out.println("이름 : ");
                            list.get(i).setAge(sc.nextInt());
                            System.out.println(" 연락처 : ");
                            list.get(i).setContact(sc.nextInt());
                            System.out.println("수정됨");
                            change1 = true;
                        }

                    }
                    if (!change1) {
                        System.out.println("수정할 학생정보가 없습니다");
                    }
                    break;
            }
        }
    }
}

