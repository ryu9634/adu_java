import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("********** 회원 탈퇴 **********");
        System.out.print("탈퇴할 아이디를 입력하세요 > ");
        String mem_userid = sc.next();

        StringBuilder sql = new StringBuilder();
        sql.append("delete from tb_member ")
                .append("where mem_userid='" + mem_userid + "'");
        System.out.println(sql);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userid, userpw);
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql.toString());
            if(result >= 1) System.out.println("탈퇴되었습니다");
            else System.out.println("실패했습니다!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
