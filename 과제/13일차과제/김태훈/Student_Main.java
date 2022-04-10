/*
과제.
    tb_student 테이블 생성
    학번, 이름, 연락처, 성별, 등록날짜

    studentDTO 클래스와 studentDAO 클래스를 사용하여 아래 기능을 구현하는 프로그램을 만들어보자.

********** 메뉴 **********
1. 학생 등록
2. 학생 리스트
3. 학생 수정
4. 학생 삭제
5. 프로그램 종료
*************************

✔ 키(key)는 학번으로 사용
 */

import java.sql.SQLException;
import java.util.Scanner;

public class Student_Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO= new StudentDAO();
        StudentDTO studentDTO;

        while (true){
            System.out.println("😗😗😗😗😗😗😗 메뉴 😗😗😗😗😗😗😗");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 리스트");
            System.out.println("3. 학생 검색");
            System.out.println("4. 학생 수정");
            System.out.println("5. 학생 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("😗😗😗😗😗😗😗 메뉴 😗😗😗😗😗😗😗");
            System.out.println("원하는 항목을 선택하세요.");
            int input = sc.nextInt();
            System.out.println();

            if(input == 6) {
                System.out.println("프로그램을 종료합니다.");
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
                    studentDAO.search();
                    break;
                case 4:
                    studentDAO.edit();
                    break;
                case 5:
                    studentDAO.delete();
                    break;
            }
        }
    }
}
