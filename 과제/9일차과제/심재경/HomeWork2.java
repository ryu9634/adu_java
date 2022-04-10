import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num, name, phoneNum;
        int user, ban, age;

        ArrayList<Student> list = new ArrayList<>();
        Student s;

        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            user = sc.nextInt();
            if (user == 6) {
                break;
            }
            switch (user) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    num = sc.next();
                    System.out.println("반을 입력하세요");
                    ban = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phoneNum = sc.next();
                    s = new Student(num, ban, name, age, phoneNum);
                    list.add(s);
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 3:
                    System.out.println("검색할 학생의 학번을 입력하세요.");
                    String find = sc.next();
                    boolean isFind = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum().equals(find)) {
                            System.out.println("학번을 찾았습니다.");
                            System.out.println(list.get(i));
                            isFind = true;
                        }
                    }
                    if (!isFind) {
                        System.out.println("학번을 찾지 못했습니다.");
                    }
                    break;
                case 4: //삭제
                    System.out.println("삭제할 학생의 학번을 입력하세요.");
                    String find1 = sc.next();
                    boolean isFind1 = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum().equals(find1)) { //비교해서 삭제
                            list.remove(list.get(i)); //remove
                            isFind1 = true;
                            System.out.println("삭제되었습니다.");
                        }
                    }
                    if (!isFind1) {
                        System.out.println("학번을 찾지 못했습니다.");
                    }
                    break;
                case 5: // 수정
                    System.out.println("수정할 학생의 학번을 입력하세요");
                    String set = sc.next();
                    boolean isset = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNum().equals(set)) { //비교해서 찾은 다음 수정
                            System.out.println("학번을 입력하세요");
                            num = sc.next();
                            System.out.println("반을 입력하세요");
                            ban = sc.nextInt();
                            System.out.println("이름을 입력하세요");
                            name = sc.next();
                            System.out.println("나이를 입력하세요");
                            age = sc.nextInt();
                            System.out.println("연락처를 입력하세요");
                            phoneNum = sc.next();
                            s = new Student(num, ban, name, age, phoneNum);
                            list.set(i, s); // set
                            isset = true;
                            System.out.println("수정되었습니다.");
                        }
                    }
                    if (!isset) {
                        System.out.println("학번을 찾지 못했습니다.");
                    }
                    break;
            }

        }
        System.out.println("프로그램을 종료 합니다.");
    }

}
