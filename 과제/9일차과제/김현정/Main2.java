import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        String name, contact;
        int sid, clas, age, menu;
        ArrayList<Student> list = new ArrayList();
        Student s;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("메뉴는 선택하세요");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            menu = sc.nextInt(); // apple
            if (menu == 6) break;

            switch (menu) {
                case 1:

                        System.out.println("* 학번을 입력하세요 : ");
                        sid = sc.nextInt();
                        System.out.println("* 반을 입력하세요 : ");
                        clas = sc.nextInt();
                        System.out.println("* 이름을 입력하세요 : " );
                        name =sc.next();
                        System.out.println("* 나이를 입력하세요 : " );
                        age=sc.nextInt();
                        System.out.println("* 연락처를 입력하세요 : " );
                        contact=sc.next();
                    s = new Student(sid,clas,name,age,contact);
                    list.add(s);
                  break;

                case 2:

                    for(int i=0; i<list.size(); i++){
                        System.out.println(list.get(i));}
                    break;
                case 3:
                    System.out.println("* 찾는 학생의 학번을 입력해주세요 : ");
                    int find = sc.nextInt();  //banana
                    boolean isFind = false;   // 단어를 찾았는지 여부
                    for (int i = 0; i < list.size(); i++) {
                        if (find==list.get(i).getStudentId()) {
                            System.out.println(" 학생을 찾았습니다! 😃");
                            System.out.println(list.get(i));
                            isFind = true;
                        }
                    }

                    if (!isFind) System.out.println("찾는 학생이 없습니다");
                    break;

                case 4:
                    if(list.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("삭제할 학생의 학번을 입력하세요.");
                    sid = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (sid == list.get(i).getStudentId()) {
                            System.out.println("입력하신 학번 " + list.get(i).getStudentId() + "의 정보를 삭제했습니다.");
                            list.remove(i);
                            isFind = true;
                        }
                    }if (!isFind) System.out.println("요청하신 학생의 정보가 없습니다.");
                    break;
                case 5:
                    if(list.size() == 0){
                        System.out.println("입력된 정보가 없습니다.");
                        break;
                    }
                    System.out.println("수정할 학생의 학번을 입력하세요.");
                    System.out.print("학번 : ");
                    sid = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (sid == list.get(i).getStudentId()) {
                            System.out.println("수정하실 학번 " + list.get(i).getStudentId() + "의 정보를 입력하세요.");
                            System.out.print("학번 : ");
                            sid = sc.nextInt();
                            System.out.print("반 : ");
                            clas = sc.nextInt();
                            System.out.print("이름 : ");
                            name = sc.next();
                            System.out.print("나이 : ");
                            age = sc.nextInt();
                            System.out.print("연락처 : ");
                            contact = sc.next();
                            System.out.println(name + " 학생의 정보를 수정했습니다.");

                            s = new Student(sid, clas, name, age, contact);
                            list.set(i, s);
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("수정할 학생의 정보가 없습니다.");
                    break;


            }
        }
    }
}