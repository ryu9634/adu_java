import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String num;
    String ban;
    String name;
    int age;
    String phone;

    public Student(String num, String ban, String name, int age, String phone) {
        this.num = num;
        this.ban = ban;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "학생정보 " +
                "학생번호 : " + num +
                ", 반 : " + ban +
                ", 이름 : " + name +
                ", 나이 : " + age +
                ", 전화번호 : " + phone ;
    }
}

class School{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 관리 프로그램입니다");

        ArrayList<Student> students= new ArrayList<>();
        String num,ban,name,phone;
        int age;
        String pick;
        Student s;
       while(true){
           System.out.println("메뉴를입력해 주세요");
           System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
           pick = sc.next();
           if(pick.equals("6"))break;
           switch(pick){
               case "1":
                   System.out.println("학번을 입력하세요");
                   num = sc.next();
                   System.out.println("반을 입력하세요");
                   ban = sc.next();
                   System.out.println("이름을 입력하세요");
                   name = sc.next();
                   System.out.println("나이를 입력하세요");
                   age = sc.nextInt();
                   System.out.println("연락처를 입력하세요");
                   phone = sc.next();
                   s = new Student(num, ban, name, age, phone);
                   students.add(s);
                   System.out.println("핵생이 등록이 되었습니다");

                   break;
               case "2":
                   System.out.println("출력을 입력하셧습니다");
                   for (int i = 0; i < students.size(); i++) {
                       System.out.print(students.get(i));
                       System.out.println("");
                   }
                   break;
               case "3":
                   System.out.println("검색하실 학생의 이름을 입력해주세요");
                   String find = sc.next();
                   boolean isFind = false;
                   for (int i = 0; i < students.size(); i++) {
                       if (students.get(i).getName().equals(find)) {
                           System.out.println("학생을 찾았습니다");
                           System.out.println(students.get(i));
                           isFind = true;
                       }

                   }
                   if (!isFind) System.out.println("찾는 학생이 없습니다");
                   break;
               case "4":
                   System.out.println("삭제할 학생의 이름을 할해주세요");
                   String del = sc.next();
                   for (int i = 0; i < students.size(); i++) {
                       if (students.get(i).getName().equals(del)) {
                           students.remove(i);
                           System.out.println("해당 학생을 삭제했습니다");
                       }
                   }
                   break;
            case "5":
                System.out.println("수정할 학생의 이름을 말해주세요");
                String chang = sc.next();

                for (int i = 0; i < students.size(); i++) {
                    if(students.get(i).getName().equals(chang))
                        System.out.println("학번을 입력하세요");
                    num = sc.next();
                    System.out.println("반을 입력하세요");
                    ban = sc.next();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phone = sc.next();
                    s = new Student(num,ban,name,age,phone);
                    students.set(i,s);
                }
break;
           }
       }
        System.out.println("프로그램을 종료합니다");
       }
    }

