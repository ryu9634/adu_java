import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        StDTO stDTO;
        StDAO stDAO=new StDAO();

        while (true) {
            System.out.println("🎂🎂🎂🎂🎂🎂🎂🎂메뉴🎂🎂🎂🎂🎂🎂🎂🎂");
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1.학생 등록 2.학생 리스트 3.학생 검색 4.학생 수정 5.학생 삭제 6.종료");
            int input= sc.nextInt();
            if (input==6){
                System.out.println("프로그램을 종료합니다");
                break;
            }

            switch (input){
                case 1:
                    stDAO.insert();
                    break;
                case 2:
                    stDAO.list();
                    break;
                case 3:
                    stDAO.search();
                    break;
                case 4:
                    stDAO.edit();
                    break;
                case 5:
                    stDAO.delete();
                    break;
            }


        }
    }

    }

