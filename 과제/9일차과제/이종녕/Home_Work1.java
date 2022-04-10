import java.util.ArrayList;
import java.util.Scanner;

public class Home_Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  name ,  call , num1;
        int num2 , age;
        ArrayList<Student> list = new ArrayList<>();
        Student w;

        System.out.println("[ 학생인적사항표 ]");
        System.out.println("gout : out : 종료하기");
        System.out.println("print : 인적사항 출력 ");
        System.out.println("showme : 학번으로 학생 검색");
        System.out.println("delete : 학번으로 학생 삭제");
        System.out.println("fixed : 학번으로 학생 수정");



        while(true){
            System.out.println("인적사항을 등록합니다. 학번을 입력해주세요");

            num1 = sc.next();

            if(num1.equals("gout"))break;

            switch (num1){



                case "print" :
                    for(int i=0;i<list.size();i++) {
                        System.out.println(list.get(i));
                    }
                    System.out.println();
                    break;

                case "showme" :
                    boolean isFind = false;
                    System.out.println("찾는 학생의 학번을 입력하세요");
                    String showme = sc.next();

                    for (int i = 0; i <list.size() ; i++) {
                        if(list.get(i).getNum1().equals(showme)){
                            System.out.println("학생을 찾았습니다.");
                            System.out.println(list.get(i));
                            isFind = true;

                        }

                    }
                    if(!isFind) System.out.println("찾는 단어가 없습니다.");
                    System.out.println();
                    break;

                case "delete" :
                    boolean isfind = false;
                    System.out.println("삭제할 학생의 학번을 입력하세요");
                    String delete = sc.next();

                    for (int i = 0; i < list.size(); i++) {

                        if(list.get(i).getNum1().equals(delete)){
                            list.remove(i);
                            System.out.println("학생을 삭제하였습니다");
                            isfind = true;
                        }



                    }if (!isfind) System.out.println("맞는 학생이 없습니다.");
                    System.out.println();
                    break;










                case "fixed" :
                    System.out.println("수정할 학생의 학번을 입력하세요");

                    String fixed = sc.next();
                    for (int i = 0; i < list.size() ; i++) {
                        if(list.get(i).getNum1().equals(fixed)){

                            list.remove(i);



                            System.out.println("이름을 입력해주세요");
                            name = sc.next();
                            System.out.println("나이를 입력해주세요");
                            age = sc.nextInt();
                            System.out.println("반을 입력해주세요");
                            num2 = sc.nextInt();
                            System.out.println("연락처를 입력해주세요");
                            call = sc.next();
                            w = new Student(num1 , name , age , num2 , call);

                            list.add(w);

                            System.out.println("등록되었습니다.");
                            System.out.println();
                        }
                    }
                    break;

                default:
                    System.out.println("이름을 입력해주세요");
                    name = sc.next();
                    System.out.println("나이를 입력해주세요");
                    age = sc.nextInt();
                    System.out.println("반을 입력해주세요");
                    num2 = sc.nextInt();
                    System.out.println("연락처를 입력해주세요");
                    call = sc.next();
                    w = new Student (num1 ,name, age , num2 , call);

                    list.add(w);
                    System.out.println("등록되었습니다.");
                    System.out.println();
                    break;


            }


        }


        System.out.println("프로그램을 종료합니다.");







    }

}
