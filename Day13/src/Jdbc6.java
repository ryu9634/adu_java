import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc6 {
    public static void main(String[] args) {
        System.out.println("********** 회원 목록 **********");
        StringBuilder sql = new StringBuilder();
        sql.append("select mem_idx, mem_userid, mem_name, mem_hp from tb_member");
        try{
            Connection conn = Dbconn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql.toString());
            while(rs.next()){
                int mem_idx = rs.getInt("mem_idx");
                String mem_userid = rs.getString("mem_userid");
                String mem_name = rs.getString("mem_name");
                System.out.println("번호:" + mem_idx + ", 아이디:" + mem_userid + ", 이름:" + mem_name);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
