import java.sql.SQLException;
import java.util.Scanner;

public class HwMain {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDTO studentDTO;
        StudentDAO studentDAO = new StudentDAO();

        while (true){
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 학생등록");
            System.out.println("2. 학생 리스트");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 프로그램종료");
            System.out.println("*************************");
            int input = sc.nextInt();
            if(input == 5){
                System.out.println("프로그램 종료");
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
                    studentDAO.edit();
                    break;
                case 4:
                    studentDAO.delete();
                    break;
            }
        }

    }
}
