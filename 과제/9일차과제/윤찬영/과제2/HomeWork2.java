import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel;
        String studentNum, classNum, name, age, callNum;
        ArrayList<Student> list = new ArrayList();
        Student student;

        while (true) {
            System.out.print("메뉴를 선택하세요(1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료) >>> ");
            sel = sc.nextInt();
            if (sel == 6) break;
            switch (sel) {
                case 1:
                    System.out.print("학번을 입력하세요 >>> ");
                    studentNum = sc.next();
                    System.out.print("반을 입력하세요 >>> ");
                    classNum = sc.next();
                    System.out.print("이름을 입력하세요 >>> ");
                    name = sc.next();
                    System.out.print("나이를 입력하세요 >>> ");
                    age = sc.next();
                    System.out.print("연락처를 입력하세요 >>> ");
                    callNum = sc.next();
                    System.out.println("저장되었습니다.");
                    System.out.println("");
                    student = new Student(studentNum, classNum, name, age, callNum);
                    list.add(student);
                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ")    " + list.get(i));
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("검색할 학생의 학번을 입력하세요 >>>");
                    String find = sc.next();
                    boolean search = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getStudentNum().equals(find)) {
                            System.out.println(list.get(i));
                            search = true;
                        }
                    }
                    if (!search) System.out.println("해당 학생을 찾지못했습니다.");
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("삭제할 학생의 학번을 입력하세요 >>>");
                    String rem = sc.next();
                    boolean search1 = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getStudentNum().equals(rem)) {
                            System.out.println(list.remove(i));
                            System.out.println("해당 학생을 삭제합니다.");
                            search1 = true;
                        }
                    }
                    if (!search1) System.out.println("해당 학생을 찾지못했습니다.");
                    System.out.println("");
                    break;

                case 5:
                    System.out.print("수정할 학생의 학번을 입력하세요 >>>");
                    String mod = sc.next();
                    boolean search2 = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getStudentNum().equals(mod)) {
                            System.out.print("반을 입력하세요 >>> ");
                            classNum = sc.next();
                            System.out.print("이름을 입력하세요 >>> ");
                            name = sc.next();
                            System.out.print("나이를 입력하세요 >>> ");
                            age = sc.next();
                            System.out.print("연락처를 입력하세요 >>> ");
                            callNum = sc.next();
                            student = new Student(mod, classNum, name, age, callNum);
                            list.set(i, student);
                            System.out.println("수정을 완료했습니다.");
                            search2 = true;
                        }
                    }
                    if (!search2) System.out.println("해당 학생을 찾지못했습니다.");
                    System.out.println("");
                    break;
            }

        }
        System.out.println("프로그램을 종료합니다.");
    }
}