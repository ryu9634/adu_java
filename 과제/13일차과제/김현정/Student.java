import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws SQLException {

        Scanner sc= new Scanner(System.in);
        StudentDAO studentDAO= new StudentDAO();
        System.out.println("*****메뉴*****");
        while (true){
            System.out.println("1. 학생등록 2. 학생리스트 3. 학생수정 4. 학생 삭제 5. 프로그램 종료");
            int input=sc.nextInt();
            if(input==5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (input){
                case 1:
                    studentDAO.input();
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