import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAO {
    Connection conn;    //db연결
    Scanner sc; //입력받는 것
    StringBuilder sql;  //String연결
    PreparedStatement pstmt;
    ResultSet rs;   //데이터저장

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요 : ");
        int num = sc.nextInt();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 : ");
        String hp = sc.next();
        System.out.print("성별을 입력하세요 : ");
        String gender = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into student (std_num, std_name, std_hp, std_gender)");
            sql.append("values(?,?,?,?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            pstmt.setString(2, name);
            pstmt.setString(3, hp);
            pstmt.setString(4, gender);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("학생등록 성공");
            else System.out.println("학생등록 실패");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }

    }
    public void list() throws SQLException{
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select std_num, std_name, std_hp, std_gender, std_regdate from student order by std_name asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int num = rs.getInt("std_num");
                String name = rs.getString("std_name");
                String hp = rs.getString("std_hp");
                String gender = rs.getString("std_gender");
                String regdate = rs.getString("std_regdate");
                System.out.println("학번 : " + num + ", 이름 : " + name + ", 연락처 : " + hp + ", 성별 : " + gender + ", 등록날찌 : " + regdate);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }

    public void edit() throws SQLException{
        sc = new Scanner(System.in);
        System.out.print("수정할 학생의 학번을 입력하세요 : ");
        int num = sc.nextInt();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 : ");
        String hp = sc.next();
        System.out.print("성별을 입력하세요 : ");
        String gender = sc.next();
        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update student set std_name=?, std_hp=?, std_gender=? where std_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setString(2, hp);
            pstmt.setString(3,gender);
            pstmt.setInt(4, num);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("학생 정보 수정이 완료!");
            else System.out.println("학생 정보 수정에 실패!");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }

    }
    public void delete() throws SQLException{
        sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 학번을 입력하세요 : ");
        int num = sc.nextInt();
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from student where std_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("학생정보 삭제 완료!");
            else System.out.println("학생정보 삭제 실패!");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt=null;
        }
    }


}
