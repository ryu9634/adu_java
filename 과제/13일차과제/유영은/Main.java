import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDTO stdDTO;
        StudentDAO stdDAO = new StudentDAO();

        while(true){
            System.out.println("********* 메뉴 **********");
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1. 학생등록 2. 학생 리스트 3. 학생 수정 4. 학생 삭제 5. 프로그램 종료");
            int choice = sc.nextInt();
            if(choice == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (choice){
                case 1:
                    stdDAO.insert();
                    break;
                case 2:
                    stdDAO.list();
                    break;
                case 3:
                    stdDAO.edit();
                    break;
                case 4:
                    stdDAO.delete();
                    break;

            }
        }

    }
}
