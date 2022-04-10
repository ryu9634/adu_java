import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class stuDAO {                               // db 연동
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요 : ");
        int num = sc.nextInt();
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phone = sc.next();
        System.out.print("성별을 입력하세요(남자 or 여자) :");
        String gender = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_num, st_name, st_phone, st_gender)");
            sql.append("values(?, ?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            pstmt.setString(2, name);
            pstmt.setString(3, phone);
            pstmt.setString(4, gender);

            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("단어 등록 성공!");
            else System.out.println("단어 등록 실패!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException{
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_phone, st_gender, st_regdate from tb_student order by st_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("st_num");
                String name = rs.getString("st_name");
                String phone = rs.getString("st_phone");
                String gender = rs.getString("st_gender");
                String regdate = rs.getString("st_gender");
                System.out.println("st_num : " + num + ", st_name : " + name + " (" + phone + ", " + gender + ", " + regdate + ")");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }
    public void edit() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("변경할 학번을 검색하세요(학번 변경 불가) : ");
        int num = sc.nextInt();
        System.out.print("변경할 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("변경할 연락처를 입력하세요 : ");
        String phone = sc.next();
        System.out.print("변경할 성별을 입력하세요 : ");
        String gender = sc.next();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name=?, st_phone=?, st_gender=? where st_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, gender);
            pstmt.setInt(4, num);

            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("변경 성공");
            else System.out.println("변경되지 않았습니다. 학번을 확인하세요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void del() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("삭제할 학번을 검색하세요 : ");
        int num = sc.nextInt();
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println(num + "의 정보가 삭제되었어요.");
            else System.out.println(num + "이 검색되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
}
