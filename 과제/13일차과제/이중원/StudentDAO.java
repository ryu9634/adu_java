import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAO {
    Connection c;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement prestate;
    ResultSet rs;

    // 입력 메소드
    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("학번 : ");
        String studentID = sc.next();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("연락처 : ");
        String ph = sc.next();
        System.out.print("성별 : ");
        String sex = sc.next();

        try{
            c = Dbconn.getConnection();
            sql = new StringBuilder();

            sql.append("insert into tb_student (st_ID, st_name, st_ph, st_sex)");
            sql.append("values(?, ?, ?, ?)");

            prestate = c.prepareStatement(sql.toString());

            prestate.setString(1, studentID);
            prestate.setString(2, name);
            prestate.setString(3, ph);
            prestate.setString(4, sex);

            int result = prestate.executeUpdate();

            if(result >= 1){
                System.out.println("🎁 학생 등록 성공");
            }else {
                System.out.println("🎁 학생 등록 실패, 입력을 확인해주세요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            prestate.close();
            prestate = null;
        }
    }

    // 출력 메소드
    public void list() throws SQLException {
        try {
            c = Dbconn.getConnection(); // db연결
            sql = new StringBuilder();
            // 사전순으로 정렬
            sql.append("select st_ID, st_name, st_ph, st_sex, st_regdate from tb_student order by st_ID asc");

            prestate = c.prepareStatement(sql.toString()); // 컴파일

            rs = prestate.executeQuery(); // 저장

            while (rs.next()) {
                String studentID = rs.getString("st_ID");
                String name = rs.getString("st_name");
                String ph = rs.getString("st_ph");
                String sex = rs.getString("st_sex");
                String rdate = rs.getString("st_regdate");

                System.out.println(studentID + " : " + name + " [" + ph + ", "+ sex + ", " + rdate + "]");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            prestate.close();
            prestate = null;
            rs.close();
            rs = null;
        }
    }

    // 수정 메소드
    public void edit() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("수정할 학생의 학번 : ");
        String studentID = sc.next();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("연락처 : ");
        String ph = sc.next();
        System.out.print("성별 : ");
        String sex = sc.next();

        try{
            c = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name=?, st_ph=?, st_sex=? where st_ID=?");

            prestate = c.prepareStatement(sql.toString());

            prestate.setString(1, name);
            prestate.setString(2, ph);
            prestate.setString(3, sex);
            prestate.setString(4, studentID);
            int result = prestate.executeUpdate();

            if(result >= 1){
                System.out.println("🎁 수정 완료");
            }else {
                System.out.println("🎁 수정 실패, 입력을 확인하세요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            prestate.close();
            prestate = null;
        }
    }

    // 삭제 메소드
    public void delete() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 학번 : ");
        String studentID = sc.next();

        try{
            c = Dbconn.getConnection(); // db연결
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_ID=?");

            prestate = c.prepareStatement(sql.toString());
            prestate.setString(1, studentID);
            int result = prestate.executeUpdate();

            if(result >= 1){
                System.out.println("🎁 삭제 성공");
            }else{
                System.out.println("🎁 삭제 실패, 입력을 확인해주세요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Dbconn.dbclose();
            prestate.close();
            prestate = null;
        }
    }
}
