import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("▶학생관리프로그램◁");
        Scanner sc = new Scanner(System.in);

        String name, phone;
        int no, classno, age, menu;

        ArrayList<Student> list = new ArrayList<>();
        Student student1;

        while(true){
            System.out.println("★메뉴를 선택하세요\n1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료★");
            menu = sc.nextInt();
            if(menu == 6) break;

            switch (menu){
                case 1 :
                    System.out.print("학번을 입력하세요 ");
                    no = sc.nextInt();
                    System.out.print("반을 입력하세요 ");
                    classno = sc.nextInt();
                    System.out.print("이름을 입력하세요 ");
                    name = sc.next();
                    System.out.print("나이를 입력하세요 ");
                    age = sc.nextInt();
                    System.out.print("연락처를 입력하세요 ");
                    phone = sc.next();
                    student1 = new Student(no,classno,name,age,phone);
                    list.add(student1);
                    break;
                case 2:
                    System.out.println("__________________________________");
                    for(Student s : list)
                        System.out.println(s);
                    System.out.println("__________________________________");
                    break;
                case 3 :
                    System.out.print("검색할 학생의 학번을 입력하세요");
                    int search = sc.nextInt();
                    boolean issearch = false;
                    for(int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNo() == search) {
                            issearch = true;
                            System.out.println(list.get(i));
                        }
                    }
                        if(!issearch) {
                            System.out.println("검색하신 학생정보가 없습니다.");
                        }
                    break;
                case 4:
                    System.out.print("삭제할 학생의 학번을 입력하세요");
                    int remove = sc.nextInt();
                    boolean isremove = false;
                    for(int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNo() == remove) {
                            isremove = true;
                            list.remove(i);
                            System.out.println("삭제되었습니다.");
                        }
                    }
                        if(!isremove)
                            System.out.println("삭제할 학생정보가 없습니다.");

                    break;
                case 5:
                    System.out.print("수정할 학생의 학번을 입력하세요");
                    int change = sc.nextInt();
                    boolean ischange = false;
                    for(int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNo() == change) {
                            ischange = true;
                            System.out.print("반을 입력하세요");
                            classno = sc.nextInt();
                            System.out.print("이름을 입력하세요");
                            name = sc.next();
                            System.out.print("나이를 입력하세요");
                            age = sc.nextInt();
                            System.out.print("연락처를 입력하세요");
                            phone = sc.next();
                            System.out.println("수정이 완료되었습니다.");
                        }
                    }
                        if(!ischange)
                            System.out.println("수정할 학생정보가 없습니다.");

                    break;
            }
        }


    }
}
