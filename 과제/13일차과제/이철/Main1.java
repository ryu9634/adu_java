import java.sql.SQLException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        studentDTO studentDTO;
        studentDAO studentDAO = new studentDAO();

        while(true){
            System.out.println("********** 메뉴 **********");
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 리스트");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("***************************");
            int input = sc.nextInt();;
            if(input == 5){
                System.out.println("프로그램을 종료합니다");
                break;
            }

            switch (input){
                case 1:
                    studentDAO.insert();
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
            }
        }
    }
}
