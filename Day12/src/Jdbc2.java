import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "1234";
        String sql = "insert into tb_member(mem_userid, mem_userpw, mem_name, " +
                "mem_hp, mem_email, mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, " +
                "mem_address1, mem_address2, mem_address3) values " +
                "('avocado', '9999', '안가도', '010-9999-9999', 'avocado@avocado.com', " +
                "'드라이브', '001011', '3068518', '12345', '서울 양천구 목동', '111-11', " +
                "'111111')";
        System.out.println(sql);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userid, userpw);
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if(result >= 1) System.out.println(result + "개의 레코드가 insert 되었음");
            else System.out.println("insert 실패!");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
