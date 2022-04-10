import java.sql.SQLException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        StudentDTO studentDTO;

        while(true) {
            System.out.println("********** 메뉴 **********");
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1.학생등록 2.학생리스트 3.학생수정 4.학생삭제 5.프로그램 종료");
            int input = sc.nextInt();

            if (input == 5) {System.out.println("프로그램을 종료합니다");break;}
            switch(input){
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
