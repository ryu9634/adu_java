import java.util.ArrayList;
import java.util.Scanner;

public class day09HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.입력");
        System.out.println("2.출력");
        System.out.println("3.검색");
        System.out.println("4.삭제");
        System.out.println("5.수정");

        String classNumber, group, name, phoneNumber;
        int class ;

        ArrayList<Word> list = new ArrayList();
        Word w;

        while (true) {
            System.out.println("학번을 입력하세요");
            classNumber = sc.next();
            if (classNumber.equals("exit"))
                break;

            switch (group) {
                case "group":
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));


                        case "name":
                            System.out.println("이름을 입력하세요");
                            String find = sc.next();
                            boolean isFind = false;
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getLevel().(isFind)){
                                    System.out.println("단어를 찾았습니다!");
                                    System.out.println(list.get(i));
                                    isFind = true;
                                }


                                if (!isFind) System.out.println("학번을 찾을 수  없습니다 ");
                                if (!isFind) System.out.println("반을 찾을 수 없습니다 ");
                                if (!isFind) System.out.println("이름을 찾을 수 없습니다");
                                if (!isFind) System.out.println("나이를 찾을 수 없습니다");
                                if (!isFind) System.out.println("연락처를 찾을 수 없습니다 ");
                            }
                    }
                default:
                    System.out.println(" 학번을 입력하세요");
                    classNumber = sc.next();
                    System.out.println("반을 입력하세요");
                    group = sc.next()
                    System.out.println("이름을 입력하세요");
                    name = sc.next();
                    System.out.println("나이를 입력하세요");
                    age = sc.nextInt();
                    System.out.println("연락처를 입력하세요");
                    phoneNumber = sc.next();
                    w = new Word(classNumber, group, age, name, phoneNumber);
                    list.add(w);


            }
            System.out.println("프로그램을 종료합니다");

        }


    }


}