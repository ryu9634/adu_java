import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("********** 회원 수정 **********");
        System.out.print("변경할 아이디를 입력하세요 > ");
        String mem_userid = sc.next();
        System.out.print("비밀번호를 입력하세요 > ");
        String mem_userpw = sc.next();
        System.out.print("이름을 입력하세요 > ");
        String mem_name = sc.next();
        System.out.print("휴대폰번호를 입력하세요 > ");
        String mem_hp = sc.next();
        System.out.print("이메일을 입력하세요 > ");
        String mem_email = sc.next();
        System.out.print("취미를 입력하세요 > ");
        String mem_hobby = sc.next();
        System.out.print("주민등록번호 앞자리를 입력하세요 > ");
        String mem_ssn1 = sc.next();
        System.out.print("주민등록번호 뒷자리를 입력하세요 > ");
        String mem_ssn2 = sc.next();
        System.out.print("우편번호를 입력하세요 > ");
        String mem_zipcode = sc.next();
        System.out.print("주소를 입력하세요 > ");
        String mem_address1 = sc.next();
        System.out.print("상세주소를 입력하세요 > ");
        String mem_address2 = sc.next();
        System.out.print("참고사항을 입력하세요 > ");
        String mem_address3 = sc.next();

        StringBuilder sql = new StringBuilder();
        sql.append("update tb_member set ")
                .append("mem_userpw='" + mem_userpw + "' ")
                .append(",mem_name='" + mem_name + "' ")
                .append(",mem_hp='" + mem_hp + "' ")
                .append(",mem_email='" + mem_email + "' ")
                .append(",mem_hobby='" + mem_hobby + "' ")
                .append(",mem_zipcode='" + mem_zipcode + "' ")
                .append(",mem_address1='" + mem_address1 + "' ")
                .append(",mem_address2='" + mem_address2 + "' ")
                .append(",mem_address3='" + mem_address3 + "' ")
                .append("where mem_userid='" + mem_userid + "'");
        System.out.println(sql);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userid, userpw);
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql.toString());
            if(result >= 1) System.out.println("회원변경이 완료되었습니다");
            else System.out.println("회원변경에 실패했습니다!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
