import java.sql.SQLException;
import java.util.Scanner;

/*
과제.
    tb_student 테이블 생성
    학번, 이름, 연락처, 성별, 등록날짜

    studentDTO, studentDAO 클래스를 사용, 프로그램 작성

*********** 메뉴 **********
1. 학생 등록
2. 학생 리스트
3. 학생 수정
4. 학셍 삭제
5. 프로그램 종료
**************************
키는 학번으로 사용
 */
public class Homework1 {
    public static void main(String[] args) throws SQLException {
        Scanner sc= new Scanner(System.in);
        StudentDTO studentDTO;
        StudentDAO studentDAO = new StudentDAO();

        while (true){
            System.out.println("*********** 메뉴 **********");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 리스트");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학셍 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("**************************");
            System.out.print("원하시는 메뉴를 선택하세요 >> ");

            int input = sc.nextInt();
            if(input == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (input){
                case 1:
                    studentDAO.insert();
                    System.out.println();
                    break;
                case 2:
                    studentDAO.list();
                    System.out.println();
                    break;
                case 3:
                    studentDAO.edit();
                    System.out.println();
                    break;
                case 4:
                    studentDAO.delete();
                    System.out.println();
                    break;
                default:
                    System.out.println("입력값 확인 바랍니다.");
                    System.out.println();
            }
        }
    }
}
