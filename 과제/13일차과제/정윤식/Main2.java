import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        StDTO stDTO;
        StDAO stDAO=new StDAO();

        while (true) {
            System.out.println("ππππππππλ©λ΄ππππππππ");
            System.out.println("μνλ λ©λ΄λ₯Ό μ ννμΈμ");
            System.out.println("1.νμ λ±λ‘ 2.νμ λ¦¬μ€νΈ 3.νμ κ²μ 4.νμ μμ  5.νμ μ­μ  6.μ’λ£");
            int input= sc.nextInt();
            if (input==6){
                System.out.println("νλ‘κ·Έλ¨μ μ’λ£ν©λλ€");
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

