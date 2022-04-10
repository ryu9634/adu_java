import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();


        System.out.println("학생 정보 시스템");
        while (true) {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 학생 정보 등록");
            System.out.println("2. 학생 정보 리스트");
            System.out.println("3. 학생 정보 수정");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("*************************");
            System.out.print("메뉴를 선택하세요 : ");
            int input = sc.nextInt();
            if (input == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (input) {
                case 1:
                    studentDAO.register();
                    break;
                case 2:
                    studentDAO.list();
                    break;
                case 3:
                    studentDAO.modify();
                    break;
                case 4:
                    studentDAO.delete();
                    break;

                default:
                    System.out.println("다시 입력하세요");
            }
        }
    }
}
