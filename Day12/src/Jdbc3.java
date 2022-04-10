import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("********** 회원 가입 **********");
        System.out.print("아이디를 입력하세요 > ");
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

        String sql = "insert into tb_member(mem_userid, mem_userpw, mem_name, " +
                "mem_hp, mem_email, mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, " +
                "mem_address1, mem_address2, mem_address3) values ('" + mem_userid +
                "', '" + mem_userpw + "', '" + mem_name + "', '" + mem_hp + "', '" +
                mem_email + "', '" + mem_hobby + "', '" + mem_ssn1 + "', '" + mem_ssn2 +
                "', '" + mem_zipcode + "', '" + mem_address1 + "', '" + mem_address2 +
                "', '" + mem_address3 + "')";
        System.out.println(sql);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userid, userpw);
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if(result >= 1) System.out.println("회원가입이 완료되었습니다");
            else System.out.println("회원가입에 실패했습니다!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

