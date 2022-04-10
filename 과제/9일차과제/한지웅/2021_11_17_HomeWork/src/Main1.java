import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택하세요");
        System.out.println("typed : 학생의 정보를 입력합니다.");
        System.out.println("print : 등록한 학생들의 정보를 출력합니다.");
        System.out.println("search : 등록한 학생들의 정보를 찾을수 있습니다.");
        System.out.println("delete : 등록한 학생들의 정보를 삭제합니다.");
        System.out.println("modify : 등록한 학생들의 정보를 수정합니다.");
        System.out.println("exit : 프로그램을 종료합니다.");


        String classroom, name, menu;
        int num, age, phone;

        ArrayList<StudentInfo> list = new ArrayList();
        StudentInfo s;

        while (true) {
            System.out.println("❤학생정보를 입력하거나 메뉴를 선택하세요❤");
            name = sc.next(); //
            if (name.equals("exit")) break;
            switch (name) {
                case "typed":
                    System.out.println(" * 학생의 정보를 입력합니다");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }break;

                case "print" :
                    System.out.println(" * 학생의 정보를 출력합니다");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }break;
                case "delete" :
                    System.out.println(" * 학생의 정보를 삭제합니다");
                    for (int i = 0; i < list.size(); i++) {
                        list.remove(i);
                        System.out.println(list.get(i));
                    }break;

                case "search"  :
                    System.out.println(" * 찾으시는 학생의 이름을 입력하세요");
                    String search = sc.next();
                    boolean isFind = false;
                    for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).getName().equals(search)){
                            System.out.println("학생을 찾았습니다! 😁");
                            System.out.println(list.get(i));
                            isFind = true;
                        }
                    }
                    if(!isFind) System.out.println("찾는 학생이 없습니다");
                    break;
                default:


                            System.out.println(" * 학번을 입력하세요 : ");
                            num = sc.nextInt(); //  1
                            System.out.println(" * 학급을 입력하세요 : ");
                            classroom = sc.next(); // 2
                            System.out.println(" * 이름을 입력하세요 : ");
                            name = sc.next(); // 김화나
                            System.out.println(" * 나이를 입력하세요 : ");
                            age = sc.nextInt(); // 19
                            System.out.println(" * 연락처를 입력하세요 : ");
                            phone = sc.nextInt(); // 01022223333
                            s = new StudentInfo(num, classroom, name, age, phone);
                            list.add(s);
                        }
                    }
        System.out.println("프로그램을 종료합니다.");
            }
        }




