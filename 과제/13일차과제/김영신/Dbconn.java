import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {

    private static Connection conn;

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSl=false";
        String userid = "root";
        String userpw = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, userid, userpw);
        return conn;
    }
    public static void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn = null;
    }
}
