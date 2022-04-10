import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StDAO {

    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요>");
        String st_num = sc.next();
        System.out.print("이름을 입력하세요>");
        String st_name = sc.next();
        System.out.print("전화번호를 입력하세요");
        String st_phonenum= sc.next();
        System.out.print("성별을 입력하세요>");
        String st_sex= sc.next();


        try {
            conn = Dbconn.getConnection(); //DB 연결
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_num, st_name, st_phonenum, st_sex)");
            sql.append("values (?,?,?,?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, st_num);
            pstmt.setString(2, st_name);
            pstmt.setString(3, st_phonenum);
            pstmt.setString(4, st_sex);

            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("학생등록 성공");
            else System.out.println("학생등록 실패");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }


    }

    public void list() throws SQLException {
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_phonenum, st_sex, st_regdate from tb_student order by st_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String st_num = rs.getString("st_num");
                String st_name = rs.getString("st_name");
                String st_phonenum = rs.getString("st_phonenum");
                String st_sex = rs.getString("st_sex");
                String regdate = rs.getString("st_regdate");
                System.out.println(st_num + " : " + st_name + " : " + st_phonenum + " , "+st_sex+" , " + regdate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }

    public void search() throws SQLException {
        sc = new Scanner(System.in);
        System.out.println("검색할 학생의 학번을 입력하세요>");
        String stunum = sc.next();
        try {
            boolean isFind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_phonenum, st_sex, st_regdate from tb_student where st_num like ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, "%" + stunum + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                isFind = true;
                String st_num = rs.getString("st_num");
                String st_name = rs.getString("st_name");
                String st_phonenum = rs.getString("st_phonenum");
                String st_sex = rs.getString("st_sex");
                String regdate = rs.getString("st_regdate");
                System.out.println(st_num + " : " + st_name + " : " + st_phonenum + " , " +st_sex + " , " + regdate);
            }
            if (!isFind) System.out.println("찾는 학생의 학번이 없습니다");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;

        }
    }

    public void edit() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("수정할 학번을 입력하세요>");
        String st_num = sc.next();
        System.out.print("학생의 이름 입력하세요>");
        String st_name = sc.next();
        System.out.print("학생의 전화번호를 입력하세요>");
        String st_phonenum= sc.next();
        System.out.print("학생의 성별을 입력하세요");
        String st_sex= sc.next();


        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name=?, st_phonenum=?, st_sex=? where st_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, st_name);
            pstmt.setString(2, st_phonenum);
            pstmt.setString(3, st_sex);
            pstmt.setString(4, st_num);
            int result = pstmt.executeUpdate();
            if (result >= 1) {
                System.out.println("학생 수정 성공!!");
            } else System.out.println("학생 수정 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;

        }

    }

    public void delete() throws SQLException{
        sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 학번을 입력하세요>");
        String stunum = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,stunum);

            int result = pstmt.executeUpdate();
            if (result >= 1) {
                System.out.println("학생 삭제 성공!!");
            } else System.out.println("학생 삭제 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;

        }



    }

}
