import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private Scanner sc = new Scanner(System.in);
    private StringBuilder sql;
    private ResultSet rs;

    public void register() throws SQLException {
        sql = new StringBuilder();
        sql.append("insert into tb_student(st_name, st_hp, st_gender) values (?,?,?)");
        System.out.print("등록할 학생의 이름을 입력하세요 : ");
        String st_name = sc.next();
        System.out.print("학생의 연락처를 입력하세요 : ");
        String st_hp = sc.next();
        System.out.print("학생의 성별을 입력하세요 : ");
        String st_gender = gender_check(sc.next());
        try {
            conn = Dbconn.getConnection();
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, st_name);
            pstmt.setString(2, st_hp);
            pstmt.setString(3, st_gender);
            System.out.println(pstmt.executeUpdate() > 0 ? "등록 성공" : "등록 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.close();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException {
        sql = new StringBuilder();
        sql.append("select * from tb_student order by st_name asc");
        try {
            conn = Dbconn.getConnection();
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int st_num = rs.getInt("st_num");
                String st_name = rs.getString("st_name");
                String st_hp = rs.getString("st_hp");
                String st_gender = rs.getString("st_gender");
                String st_regdate = rs.getString("st_regdate");
                System.out.println("학번: " + st_num +
                        "  이름: " + st_name + "(" + st_gender + ")" +
                        "  연락처: " + st_hp +
                        "  [등록일: " + st_regdate + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.close(); pstmt.close(); rs.close(); pstmt = null; rs = null;
        }
    }

    public void modify() throws SQLException {
        sql = new StringBuilder();
        sql.append("update tb_student set st_name=?, st_hp=?, st_gender=? where st_num=?");
        System.out.println("수정할 학생의 학번을 입력하세요");
        int st_num = sc.nextInt();
        if (!exist(st_num)) {
            System.out.println("해당 학생의 정보가 조회되지 않습니다");
            return;
        }
        System.out.println("학생의 이름을 입력하세요");
        String st_name = sc.next();
        System.out.println("학생의 연락처를 입력하세요");
        String st_hp = sc.next();
        System.out.println("학생의 성별을 입력하세요");
        String st_gender = gender_check(sc.next());
        try {
            conn = Dbconn.getConnection();
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, st_name);
            pstmt.setString(2, st_hp);
            pstmt.setString(3, st_gender);
            pstmt.setInt(4, st_num);
            System.out.println(pstmt.executeUpdate() > 0 ? "수정 완료" : "수정 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            Dbconn.close(); pstmt.close(); pstmt = null;
        }
    }

    public void delete() throws SQLException {
        sql = new StringBuilder();
        sql.append("delete from tb_student where st_num = ?");
        System.out.println("삭제할 학생의 학번을 입력하세요");
        int st_num = sc.nextInt();
        if (!exist(st_num)) {
            System.out.println("해당 학생의 정보가 조회되지 않습니다");
            return;
        }
        try {
            conn = Dbconn.getConnection();
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, st_num);
            System.out.println(pstmt.executeUpdate() > 0 ? "삭제 성공" : "삭제 실패");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.close(); pstmt.close(); pstmt = null;
        }
    }

    private String gender_check(String gender) {
        if (!gender.equals("남자") && !gender.equals("여자"))
            while (!gender.equals("남자") && !gender.equals("여자")) {
                System.out.println("성별은 남자 , 여자로만 입력해주세요");
                System.out.print("학생의 성별을 입력해주세요 : ");
                gender = sc.next();
            }
        return gender;
    }

    private boolean exist(int num) throws SQLException {
        String tempSQL = "select st_num from tb_student where st_num = ?";
        boolean temp = false;
        try {
            conn = Dbconn.getConnection();
            pstmt = conn.prepareStatement(tempSQL);
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            temp = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.close(); pstmt.close(); rs.close(); pstmt = null; rs = null;
        }
        return temp;
    }
}

