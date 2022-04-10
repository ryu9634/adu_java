import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String student_num;
    private String class_num;
    private String name;
    private int age;
    private String phone_number;

    public Student(String student_num, String class_num, String name, int age, String phone_number) {
        this.student_num = student_num;
        this.class_num = class_num;
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }

    public String getStudent_num() {
        return student_num;
    }

    public void setStudent_num(String student_num) {
        this.student_num = student_num;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return  "학번" + ": " + student_num + '\n' +
                "반" +  ": " + class_num + '\n' +
                "이름" +  ": " + name + '\n' +
                "나이" + ": " +  age + '\n' +
                "연락처" +  ": " + phone_number;
    }
}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================학생 관리==================");

        String student_num;
        String class_num;
        String name;
        int age;
        String phone_number;

        ArrayList<Student> list = new ArrayList<>();
        Student stu;

        while (true){
            System.out.println("메뉴를 선택하세요.(1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료)");
           int choice = sc.nextInt();
            System.out.println();
           if(choice == 6){
               System.out.println("프로그램 종료");
               break;
           }
           switch (choice){
               case 1:
                   System.out.println("학번을 입력하세요");
                   student_num = sc.next();
                   System.out.println("반을 입력하세요");
                   class_num = sc.next();
                   System.out.println("이름을 입력하세요");
                   name = sc.next();
                   System.out.println("나이를 입력하세요");
                   age = sc.nextInt();
                   System.out.println("연락처를 입력하세요");
                   phone_number = sc.next();

                   stu = new Student(student_num, class_num, name, age, phone_number);
                   list.add(stu);
                   System.out.println();
                   break;

               case 2:
                   for (int i = 0; i < list.size(); i++) {
                       System.out.println(list.get(i));
                       System.out.println("-------------------------");
                   }
                   System.out.println();
                   break;

               case 3:
                   boolean isfind = false;
                   System.out.println("검색할 학생의 학번을 입력해주세요.");
                   String find = sc.next();
                   for (int i = 0; i < list.size(); i++) {
                       if (find.equals(list.get(i).getStudent_num())){
                           System.out.println(list.get(i));
                           isfind = true;
                       }
                   }
                   if(!isfind) System.out.println("찾으시는 학생의 정보가 없습니다.");
                   System.out.println();
                   break;

               case 4:
                   boolean isdelete = false;
                   System.out.println("삭제하실 학생의 학번을 입력하세요");
                   String delete = sc.next();
                   for (int i = 0; i < list.size(); i++) {
                       if (list.get(i).getStudent_num().equals(delete)){
                           list.remove(i);
                           System.out.println("성공적으로 삭제되었습니다.");
                           isdelete = true;
                       }
                   }
                   if (!isdelete) System.out.println("이미 삭제되었거나 없는 학생입니다.");
                   System.out.println();
                   break;

               case 5:
                   boolean isset = false;
                   System.out.println("수정하실 학생의 학번을 입력하세요");
                   String set_number = sc.next();
                   System.out.println();
                   for (int i = 0; i < list.size(); i++) {
                       if (list.get(i).getStudent_num().equals(set_number)){
                           System.out.println("학번을 입력하세요");
                           student_num = sc.next();
                           System.out.println("반을 입력하세요");
                           class_num = sc.next();
                           System.out.println("이름을 입력하세요");
                           name = sc.next();
                           System.out.println("나이를 입력하세요");
                           age = sc.nextInt();
                           System.out.println("연락처를 입력하세요");
                           phone_number = sc.next();
                           stu = new Student(student_num, class_num, name, age, phone_number);
                           list.set(i,stu);

                           System.out.println("성공적으로 수정되었습니다!");
                           isset = true;
                       }
                   }
                   if (!isset) System.out.println("이미 삭제되었거나 없는 학생입니다.");
                   System.out.println();
                   break;
           }
        }
    }
}
