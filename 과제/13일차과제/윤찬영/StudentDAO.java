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
        System.out.print("학번을 입력하세요 >> ");
        int num = sc.nextInt();

        try {
            boolean isfind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num from tb_student where st_num = ?");
            pstmt = conn.prepareStatement(sql.toString()); // 컴파일 먼저
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("이전 등록된 학생입니다.");
            } else {
                System.out.print("학생이름을 입력하세요 >> ");
                String name = sc.next();
                System.out.print("연락처을 입력하세요 >> ");
                String hp = sc.next();
                String gender;
                int t = 0;
                do {
                    System.out.print("성별을 입력하세요('남자' or '여자') >> ");
                    gender = sc.next();
                    if (!(gender.equals("남자") || gender.equals("여자"))) {
                        System.out.println("남자 혹은 여자만 입력하세요");
                    } else {
                        t++;
                    }
                } while (t == 0);
                sql = new StringBuilder();
                sql.append("insert into tb_student (st_num, st_name, st_hp, st_gender)");
                sql.append(" values (?,?,?,?)");
                pstmt = conn.prepareStatement(sql.toString());
                pstmt.setInt(1, num);
                pstmt.setString(2, name);
                pstmt.setString(3, hp);
                pstmt.setString(4, gender);
                int result = pstmt.executeUpdate();
                if (result >= 1) System.out.println("학생등록 성공!");
                else System.out.println("학생등록 실패!");
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

    public void list() throws SQLException {
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_hp, st_gender, st_regdate from tb_student order by st_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("st_num");
                String name = rs.getString("st_name");
                String hp = rs.getString("st_hp");
                String gender = rs.getString("st_gender");
                String regdate = rs.getString("st_regdate");
                System.out.println(num + ", " + name + "," + hp + ", " + gender + ", " + regdate);
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

    public void edit() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("수정할 학생의 학번를 입력하세요 >> ");
        int num = sc.nextInt();

        try {
            boolean isfind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num from tb_student where st_num = ?");
            pstmt = conn.prepareStatement(sql.toString()); // 컴파일 먼저
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                isfind = true;
                System.out.print("학생의 이름을 입력하세요 >> ");
                String name = sc.next();
                System.out.print("연락처를 입력하세요 >> ");
                String hp = sc.next();
                String gender;
                int t = 0;
                do {
                    System.out.print("성별을 입력하세요('남자' or '여자') >> ");
                    gender = sc.next();
                    if (!(gender.equals("남자") || gender.equals("여자"))) {
                        System.out.println("남자 혹은 여자만 입력하세요");
                    } else {
                        t++;
                    }
                } while (t == 0);
                sql = new StringBuilder();
                sql.append("update tb_student set st_name = ?, st_hp = ?, st_gender = ? where st_num = ?");
                pstmt = conn.prepareStatement(sql.toString());
                pstmt.setString(1, name);
                pstmt.setString(2, hp);
                pstmt.setString(3, gender);
                pstmt.setInt(4, num);
                int result = pstmt.executeUpdate();
                if (result >= 1) System.out.println("학생 정보 수정 성공!");
                else System.out.println("학생 정보 수정 실패!");
            }
            if (!isfind) {
                System.out.println("등록된 학생이 아닙니다. 학번을 다시 확인해주세요");
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

    public void delete() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 학번을 입력하세요 >> ");
        int num = sc.nextInt();
        try {
            boolean isfind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num from tb_student where st_num = ?");
            pstmt = conn.prepareStatement(sql.toString()); // 컴파일 먼저
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                isfind = true;
                sql = new StringBuilder();
                sql.append("delete from tb_student where st_num = ?");
                pstmt = conn.prepareStatement(sql.toString());
                pstmt.setInt(1, num);
                int result = pstmt.executeUpdate();
                if (result >= 1) System.out.println("학생 정보 삭제 성공!");
                else System.out.println("학생 정보 삭제 실패!");
            }
            if (!isfind) {
                System.out.println("등록된 학생이 아닙니다. 학번을 다시 확인해주세요");
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

}
