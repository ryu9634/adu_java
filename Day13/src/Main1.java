import java.sql.SQLException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        VocaDTO vocaDTO;
        VocaDAO vocaDAO = new VocaDAO();

        while (true){
            System.out.println("😁😁😁 단어장 😁😁😁");
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1.등록 2.리스트 3.검색 4.수정 5.삭제 6.종료");
            int input = sc.nextInt();
            if(input == 6){
                System.out.println("프로그램을 종료합니다");
                break;
            }

            switch (input){
                case 1:
                    vocaDAO.insert();
                    break;
                case 2:
                    vocaDAO.list();
                    break;
                case 3:
                    vocaDAO.search();
                    break;
                case 4:
                    vocaDAO.edit();
                    break;
                case 5:
                    vocaDAO.delete();
                    break;
            }
        }
    }
}
