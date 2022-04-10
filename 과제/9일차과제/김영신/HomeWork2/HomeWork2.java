import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean isFind = false;
        int inputNum;
        int num, _class, age;
        String name, phone;
        Student student;

        out:
        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            inputNum = sc.nextInt();
            switch (inputNum) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    num = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    _class = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요.");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phone = sc.next();
                    student = new Student(num, _class, name, age, phone);
                    list.add(student);
                    System.out.println(student.getName() + "학생이 등록되었습니다.");
                    break;
                case 2:
                    for (Student s : list) {
                        System.out.println(s);
                        System.out.println("────────────────────────────────────────────────");
                    }
                    break;
                case 3:
                    System.out.println("검색할 학생의 학번을 입력하세요");
                    num = sc.nextInt();
                    isFind = false;
                    for (Student s : list) {
                        if (s.getNum() == num) {
                            System.out.println(s);
                            isFind = true;
                            break;
                        }
                    }
                    if (!isFind) System.out.println("찾는 학생의 정보가 없습니다.");
                    break;
                case 4:
                    System.out.println("삭제할 학생의 학번을 입력하세요");
                    num = sc.nextInt();
                    isFind = false;
                    for (Student s : list) {
                        if (s.getNum() == num) {
                            isFind = true;
                            System.out.println(s);
                            System.out.println("위 학생의 정보를 시스템에서 삭제하시겠습니까? 1.예 2.아니요");
                            inputNum = sc.nextInt();
                            if (inputNum == 1) {
                                list.remove(s);
                                System.out.println("삭제 되었습니다.");
                            } else System.out.println("취소 되었습니다.");

                            break;
                        }
                    }
                    if (!isFind) System.out.println("해당 학생의 정보가 없습니다.");
                    break;
                case 5:
                    System.out.println("수정할 학생의 학번을 입력하세요");
                    num = sc.nextInt();
                    isFind = false;
                    for (Student s : list) {
                        if (s.getNum() == num) {
                            isFind = true;
                            System.out.println("새로운 학번을 입력하세요");
                            s.setNum(sc.nextInt());
                            System.out.println("반을 입력하세요");
                            s.set_class(sc.nextInt());
                            System.out.println("이름을 입력하세요");
                            s.setName(sc.next());
                            System.out.println("나이를 입력하세요.");
                            s.setAge(sc.nextInt());
                            System.out.println("연락처를 입력하세요");
                            s.setPhone(sc.next());

                            System.out.println(s);
                            System.out.println("위와 같이 수정되었습니다.");
                            break;
                        }
                    }
                    if (!isFind) System.out.println("수정할 학생의 정보가 없습니다.");
                    break;
                case 6:
                    break out;
                default:
                    System.out.println("다시 입력하세요");

            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

}
