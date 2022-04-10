import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class studentDAO {
    StringBuilder sql;
    ResultSet rs;
    Scanner sc;
    PreparedStatement pstmt;


    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.println("등록할 학생의 학번을 입력해주세요");
        String num = sc.next();
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("연락처를 입력하세요");
        String hp = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_num, st_name, st_hp) values (?,?,?) ");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, num);
            pstmt.setString(2, name);
            pstmt.setString(3, hp);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("등록 완료! ");
            else System.out.println("등록 실패 !");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            conn.close();
            conn = null;
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException {
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_hp, st_rdate from tb_student order by st_num ");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String num = rs.getString("st_num");
                String name = rs.getString("st_name");
                String hp = rs.getString("st_hp");
                String regdate = rs.getString("st_rdate");
                System.out.println(num + "," + name + "," + hp + "," + regdate);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            conn.close();
            conn = null;
            pstmt.close();
            pstmt = null;
        }
    }
                                              // 수정
    public void rename() throws SQLException {
        sc = new Scanner(System.in);
        System.out.println("수정할 학번을 입력하세요");
        String num = sc.next();
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("연락처를 입력하세요 ");
        String hp = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update  tb_student set st_name=?, st_hp=? where st_num=? ");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setString(2, hp);
            pstmt.setString(3, num);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("수정 완료");
            else System.out.println("수정 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            conn.close();
            conn = null;
        }
    }

    public void delete() throws SQLException { // 삭제
        sc = new Scanner(System.in);
        System.out.println("삭제할 학번을 입력하세요 ");
        String num = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_num=? ");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, num);
            int res = pstmt.executeUpdate();
            if (res >= 1) System.out.println("삭제 완료");
            else System.out.println("삭제 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            conn.close();
            conn = null;

        }
    }
}


public class studentDAO {
    Connection conn;
}