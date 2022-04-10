import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAO {
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("등록할 학번을 입력하세요 > ");
        int idx = sc.nextInt();
        System.out.print("이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 > ");
        String hp = sc.next();
        System.out.print("성별을 입력하세요 > ");
        String gd = sc.next();

        try {
            conn = DbconnHw.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_idx, st_name, st_hp, st_gd)");
            sql.append("values(?, ?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, idx);
            pstmt.setString(2, name);
            pstmt.setString(3, hp);
            pstmt.setString(4, gd);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("학생 정보가 성공적으로 저장되었습니다");
            else System.out.println("저장 실패! 다시 시도하세요");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbconnHw.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException{
        try {
            conn = DbconnHw.getConnection();
            sql = new StringBuilder();
            sql.append("select st_idx, st_name, st_hp, st_gd, st_regdate from tb_student order by st_idx asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int idx = rs.getInt("st_idx");
                String name = rs.getString("st_name");
                String hp = rs.getString("st_hp");
                String gd = rs.getString("st_gd");
                String regdate = rs.getString("st_regdate");
                System.out.println( idx + " : " + name + ", " + hp + ", " + gd + ", " + regdate );

            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            DbconnHw.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }
    public void edit() throws SQLException{
        sc = new Scanner(System.in);
        System.out.print("수정할 학번을 입력하세요 > ");
        int idx = sc.nextInt();
        System.out.print("수정할 이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("수정할 전화번호를 입력하세요 > ");
        String hp = sc.next();
        System.out.print("수정할 성별을 입력하세요 > ");
        String gd = sc.next();

        try {
            conn = DbconnHw.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name=?, st_hp=?, st_gd=? where st_idx=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setString(2, hp);
            pstmt.setString(3, gd);
            pstmt.setInt(4, idx);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("정보 수정 성공!");
            else System.out.println("정보 수정 실패!");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbconnHw.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
    public void delete() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("삭제할 학번을 입력하세요 > ");
        String word = sc.next();

        try {
            conn = DbconnHw.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_idx=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, word);
            int reselt = pstmt.executeUpdate();
            if (reselt >= 1) System.out.println("정보 삭제 성공!");
            else System.out.println("정보 삭제 실패!");
         }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbconnHw.dbclose();
            pstmt.close();
            pstmt = null;
        }
        }

}
