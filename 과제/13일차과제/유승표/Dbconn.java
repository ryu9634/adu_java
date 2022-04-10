import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//   싱글톤 패턴
//   디자인 패턴중 하나로 매번 드라이버를 로드하지 않고 프로세스에서 객체를 단 하나만 만들어 재활용 할 수 있도록
//   공유자원을 생성하는 방법
public class Dbconn { // connection 객체를 메모리에 미리 띄어 놓고 가져다 쓰기 위해만듬

    private static Connection conn;  //메모리에 올려두고 conn 을 재활용 가능

    // Dbconn.getConnection() 을 불러 연결하고 연결 객체를 리턴시켜주면 사용이 가능하다.
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=False";

        String userid = "root";
        String userpw = "1234";


        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, userid, userpw);   // Exception 이 나올수 있지만 이리 메소드를 생성하면서
        return conn;                                               // 던져두어서 try-catch 로 묵을 필요가 없음음
    }

    public static void dbclose() {  // DB를 닫아주는 메소드
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
