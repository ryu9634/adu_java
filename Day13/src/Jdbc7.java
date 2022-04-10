import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc7 {
    public static void main(String[] args) {
        System.out.println("********** 로그인 **********");
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 > ");
        String mem_userid = sc.next();
        System.out.print("비밀번호를 입력하세요 > ");
        String mem_userpw = sc.next();
        StringBuilder sql = new StringBuilder();
        sql.append("select mem_idx from tb_member where mem_userid='" + mem_userid)
                .append("' and mem_userpw='" + mem_userpw + "'");
        System.out.println(sql);
        try{
            Connection conn = Dbconn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql.toString());
            if(rs.next()){
                System.out.println("로그인 되었습니다");
            }else{
                System.out.println("아이디 또는 비밀번호가 틀렸습니다");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
