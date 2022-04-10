import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ban, age, search;
        String name, phone;
        ArrayList<Student> array = new ArrayList<>();
        Student s;

        while(true){
            System.out.println("메뉴를 입력하세요!");
            System.out.println("1.입력, 2.출력, 3.검색, 4.삭제, 5.수정, 6.종료");
            num = sc.nextInt();
            if(num == 6) break;
            switch (num){
                case 1 :
                    System.out.println("학번을 입력하세요");
                    num = sc.nextInt();
                    System.out.println("반을 입력하세요.");
                    ban = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("폰 번호를 입력하세요");

                    phone = sc.next();
                    s = new Student(num, ban, name, age, phone);
                    array.add(s);
                    break;
                case 2:
                    for (int i = 0; i < array.size(); i++) {
                        System.out.println(array.get(i));
                    }
                    break;
                case 3:
                    System.out.println("검색할 학생의 학번을 입력하세요.");
                    search = sc.nextInt();
                    boolean isFind = false;
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            System.out.println(array.get(i));
                            isFind = true;
                        }
                    }
                    if(isFind == false){
                        System.out.println("찾는 학생의 정보가 없습니다.");
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 학생의 학번을 입력하세요.");
                    search = sc.nextInt();
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            array.remove(i);
                            System.out.println("삭제되었습니다.");
                        }
                    }
                    break;
                case 5 :
                    System.out.println("수정할 학생의 학번을 입력하세요.");
                    search = sc.nextInt();
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            System.out.println("학번을 입력하세요");
                            num = sc.nextInt();
                            System.out.println("반을 입력하세요.");
                            ban = sc.nextInt();
                            System.out.println("이름을 입력하세요");
                            name = sc.next();
                            System.out.println("나이를 입력하세요");
                            age = sc.nextInt();
                            System.out.println("폰 번호를 입력하세요");
                            phone = sc.next();
                            s = new Student(num, ban, name, age, phone);
                            array.set(i, s);
                        }
                    }
                    break;
            }
        }
    }
}
