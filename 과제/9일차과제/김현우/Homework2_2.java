import java.util.ArrayList;
import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num, Old, search;
        String Classnum, Name, Phonenum;
        ArrayList<Homework2> array = new ArrayList<>();
        Homework2 h;

        while(true){
            System.out.println("메뉴를 입력하세요!");
            System.out.println("1.입력 2.출력 3.검색 4.삭제 5.수정 6.종료");
            Num = sc.nextInt();
            if(Num == 6) break;
            switch (Num){
                case 1 :
                    System.out.println("학번을 입력하세요");
                    Num = sc.nextInt();
                    System.out.println("반을 입력하세요");
                    Classnum = sc.next();
                    System.out.println("이름을 입력하세요");
                    Name = sc.next();
                    System.out.println("나이를 입력하세요");
                    Old = sc.nextInt();
                    System.out.println("연락처를 입력하세요");

                    Phonenum = sc.next();
                    h = new Homework2(Num, Classnum, Name, Old);
                    array.add(h);
                    break;
                case 2:
                    for (int i = 0; i < array.size(); i++) {
                        System.out.println(array.get(i));
                    }
                    break;
                case 3:
                    System.out.println("검색할 학번을 입력하세요");
                    search = sc.nextInt();
                    boolean find = false;
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            System.out.println(array.get(i));
                            find = true;
                        }
                    }
                    if(find == false){
                        System.out.println("정보가 없습니다");
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 학번을 입력하세요");
                    search = sc.nextInt();
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            array.remove(i);
                            System.out.println("삭제되었습니다");
                        }
                    }
                    break;
                case 5 :
                    System.out.println("수정할 학번을 입력하세요");
                    search = sc.nextInt();
                    for (int i = 0; i < array.size(); i++) {
                        if(array.get(i).getNum() == search){
                            System.out.println("학번을 입력하세요");
                            Num = sc.nextInt();
                            System.out.println("반을 입력하세요");
                            Classnum = sc.next();
                            System.out.println("이름을 입력하세요");
                            Name = sc.next();
                            System.out.println("나이를 입력하세요");
                            Old = sc.nextInt();
                            System.out.println("연락처를 입력하세요");
                            Phonenum = sc.next();
                            h = new Homework2(Num, Classnum, Name, Old);
                            array.set(i, h);
                        }
                    }
                    break;
            }
        }
    }
}
