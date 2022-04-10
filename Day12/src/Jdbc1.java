import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버가 로드되었습니다");
            Connection conn = DriverManager.getConnection(url, userid, userpw);
            System.out.println("Mysql에 정상적으로 연결되었습니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
