import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class studentDAO {

    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("등록할 학생의 학번을 적어주세요 > ");
        int num = sc.nextInt();
        System.out.print("등록할 학생의 이름을 적어주세요 > ");
        String name = sc.next();
        System.out.print("등록할 학생의 연락처를 적어주세요 > ");
        int hp = sc.nextInt();
        System.out.print("등록할 학생의 성별을 적어주세요 > ");
        String gender = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (stu_num, stu_name, stu_hp, stu_gender)");
            sql.append("values (?, ?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            pstmt.setString(2, name);
            pstmt.setInt(3, hp);
            pstmt.setString(4, gender);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("학생 등록의 성공 하였습니다");
            else System.out.println("학생을 등록하는데 실패했습니다");
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
            sql.append("select stu_num, stu_name, stu_hp, stu_gender, stu_register from tb_student order by stu_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("stu_num");
                String name = rs.getString("stu_name");
                int hp = rs.getInt("stu_hp");
                String gender = rs.getString("stu_gender");
                String register = rs.getString("stu_register");
                System.out.println(num + " : " + name + "(" + hp + ", " + gender + ", " + register + ")");

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

    public void modify() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("수정할 학번을 입력하세요 > ");
        int num = sc.nextInt();
        System.out.print("수정할 이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("수정할 전화번호를 입력하세요 > ");
        int hp = sc.nextInt();
        System.out.print("수정할 성별을 입력하세요 > ");
        String gender = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set stu_name=?, stu_hp=?, stu_gender=? where stu_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setInt(2, hp);
            pstmt.setString(3, gender);
            pstmt.setInt(4, num);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("수정 하셨습니다");
            else System.out.println("수정 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
        public void delete() throws SQLException {
            sc = new Scanner(System.in);
            System.out.print("삭제할 학번을 입력하세요 > ");
            int number = sc.nextInt();

            try {
                conn = Dbconn.getConnection();
                sql = new StringBuilder();
                sql.append("delete from tb_student where stu_num=?");
                pstmt = conn.prepareStatement(sql.toString());
                pstmt.setInt(1, number);
                int result = pstmt.executeUpdate();
                if (result >= 1) System.out.println("삭제 되었습니다");
                else System.out.println("삭제 실패했습니다");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Dbconn.dbclose();
                pstmt.close();
                pstmt = null;
            }
        }
    }

