import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("[학생관리프로그램]");
        System.out.println("print: 지금까지 등록한 학생 출력");
        System.out.println("find: 학생을 검색할 수 있음");
        System.out.println("delete: 학생을 삭제할 수 있음");
        System.out.println("set: 학생정보를 수정할 수 있음");
        System.out.println("exit: 프로그램 종료");

        String name, stnum, phonenum;
        int age,stclass;
        ArrayList<Student> list =new ArrayList();
        Student s;

        while (true){
            System.out.println("🎁학생이름 또는 메뉴를 입력하세요🎁");
            name=sc.next();
            if(name.equals("exit")) break;

            switch (name){
                case "print":
                    for(int i=0; i<list.size(); i++){
                        System.out.println(list.get(i));
                        //System.out.println(list.get(i).getEnglish());
                    }
                    break;
                case "find":
                    System.out.println("*찾는 학생을 입력하세요");
                    String find=sc.next();
                    boolean isFind=false;
                    for(int i=0; i< list.size(); i++){
                        if (list.get(i).getName().equals(find)){
                            System.out.println("학생을 찾았습니다");
                            System.out.println(list.get(i));
                            isFind=true;
                            if (!isFind) System.out.println("찾는학생이 없습니다");
                            break;
                        }
                    }
                    break;

                case "set":
                    boolean isset=false;
                    System.out.println("*수정할 할생을 입력하세요");
                    String set_name= sc.next();
                    System.out.println();
                    for (int i=0; i< list.size(); i++){
                        if (list.get(i).getName().equals(set_name)){
                            System.out.println("이름을 입력하세요");
                             name=sc.next();
                            System.out.println("학번을 입력하세요");
                            stnum=sc.next();
                            System.out.println("반을 입력하세요");
                            stclass=sc.nextInt();
                            System.out.println("나이를 입력하세요");
                            age=sc.nextInt();
                            System.out.println("전화번호를 입력하세요");
                            phonenum=sc.next();
                            s=new Student(stnum,stclass,name,age,phonenum);
                            list.set(i,s);

                            System.out.println("성공적으로 수정되었습니다");
                            isset=true;
                        }
                    }
                    if (!isset) System.out.println("이미 삭제되었거나 없는 학생입니다.");
                    System.out.println();
                    break;


                case "delete":
                    boolean isdelete = false;
                    System.out.println("삭제하실 학생의 이름을 입력하세요");
                    String delete = sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equals(delete)){
                            list.remove(i);
                            System.out.println("성공적으로 삭제되었습니다.");
                            isdelete = true;
                        }
                    }
                    if (!isdelete) System.out.println("이미 삭제되었거나 없는 학생입니다.");
                    System.out.println();
                    break;


                default:
                    System.out.println("*학번을 입력하세요:");
                    stnum=sc.next();
                    System.out.println("*반을 입력하세요");
                    stclass=sc.nextInt();
                    System.out.println("*나이를 입력하세요");
                    age=sc.nextInt();
                    System.out.println("*전화번호를 입력하세요");
                    phonenum= sc.next();
                    s=new Student(stnum,stclass,name,age,phonenum);
                    list.add(s);

            }
        }

        System.out.println("프로그램을 종료합니다");



    }
}
