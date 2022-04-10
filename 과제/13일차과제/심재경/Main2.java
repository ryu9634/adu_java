import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        Scanner sc =new Scanner(System.in);
        StudentDAO studentDAO =new StudentDAO();
        StudentDTO studentDTO;

        while (true){
            System.out.println("******* 메뉴 *******");
            System.out.println("1.학생 등록\n" +
                    "2.학생 리스트\n" +
                    "3.학생 수정\n" +
                    "4.학생 삭제\n" +
                    "5.프로그램 종료");
            System.out.println("*******************");
            int input =sc.nextInt();
            if (input == 5){ //5. 종료 입력시 프로그램 종료
                System.out.println("프로그램 종료 합니다");
                break;
            }

            switch (input) {
                case 1:
                    studentDAO.insert(); //등록
                    break;
                case 2:
                    studentDAO.list(); //리스트 출력
                    break;
                case 3:
                    studentDAO.rename(); //수정
                    break;
                case 4:
                    studentDAO.delete(); //삭제
                    break;
            }
        }
    }
}
