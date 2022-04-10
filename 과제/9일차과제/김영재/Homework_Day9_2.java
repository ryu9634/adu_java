import java.util.ArrayList;
import java.util.Scanner;

public class Homework_Day9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name,phone;
        int stno, ban, age;

        ArrayList<Student> list = new ArrayList<>();
        Student s;

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            int sel = sc.nextInt();
            if (sel == 6) break;

            switch (sel) {
                case 1:
                    System.out.println("학번을 입력하세요");
                    stno = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    ban = sc.nextInt();
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phone = sc.next();
                    s = new Student(stno,ban,name,age,phone);
                    list.add(s);
                    break;
                case 2:
                    for(int i = 0; i < list.size();i++){
                        System.out.println(list.get(i));
                        System.out.println("----------------");
                    }if (list.size() == 0)
                    System.out.println("입력된 학생 정보가 없습니다");
                    break;
                case 3:
                    System.out.println("검색할 학생의 학번을 입력하세요");
                    int find = sc.nextInt();
                    boolean isFind = false;
                    for(int i = 0; i < list.size();i++){
                        if(find == list.get(i).getStno()){
                            System.out.println(list.get(i));
                            isFind = true;
                            break;
                        }
                    }
                    if(!isFind) System.out.println("찾는 학생의 정보가 없습니다");
                    break;
                case 4:
                    System.out.println("삭제할 학생의 학번을 입력하세요");
                    int del = sc.nextInt();
                    for(int i = 0; i< list.size();i++){
                        if(del == list.get(i).getStno()){
                            System.out.println("삭제되었습니다!");
                            list.remove(i);
                            break;
                        }else System.out.println("학번을 잘못입력하셨습니다");
                        break;
                    }break;
                case 5:
                    System.out.println("수정할 학생의 학번을 입력하세요");
                    int mod = sc.nextInt();
                    for(int i = 0; i < list.size();i++){
                        if(mod == list.get(i).getStno()){
                            int mod2 = mod;
                            System.out.println("반을 입력하세요");
                            int ban2 = sc.nextInt();
                            System.out.println("이름을 입력하세요");
                            String name2 = sc.next();
                            System.out.println("나이를 입력하세요");
                            int age2 = sc.nextInt();
                            System.out.println("연락처를 입력하세요");
                            String phone2 = sc.next();
                            s = new Student(mod2,ban2,name2,age2,phone2);
                            list.set(i,s);
                        }
                    }
                    System.out.println("수정되었습니다");
                    break;
            }
        }
    }
}
