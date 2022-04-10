import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {
    private static Connection conn;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSLL=false";
        String userid = "root";
        String userpw = "12341234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, userid, userpw);
        return conn;
    }

    public static void dbclose() {

        try {
            conn.close();
            conn = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
