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

    //    private int idx;
    //    private String num;
    //    private String name;
    //    private String hp;
    //    private String gender;
    //    private String wdate;
    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요 > ");
        String num = sc.next();
        System.out.print("이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 > ");
        String hp = sc.next();
        System.out.print("성별을 입력하세요(남/여) > ");
        String gender = sc.next();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (stu_num, stu_name, stu_hp, stu_gender)");
            sql.append(" values (?,?,?,?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, num);
            pstmt.setString(2, name);
            pstmt.setString(3, hp);
            pstmt.setString(4, gender);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("학생 등록 성공!");
            else System.out.println("학생 등록 실패");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException{
        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select stu_num, stu_name, stu_hp, stu_gender, stu_regdate from tb_student order by stu_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String num = rs.getString("stu_num");
                String name = rs.getString("stu_name");
                String hp = rs.getString("stu_hp");
                String gender = rs.getString("stu_gender");
                String regdate = rs.getString("stu_regdate");
                System.out.println("학번: " + num + ", " + "이름: " + name +" (" +  "연락처:" + hp + ", " + "성별:" + gender + "자) - " + "[등록일: " +regdate + "]");
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

    public void search() throws SQLException{
        sc = new Scanner(System.in);
        System.out.print("검색할 학번을 입력하세요 > ");
        String word = sc.next();
        try{
            boolean isFind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            // sql.append("select vo_eng, vo_kor, vo_level, vo_regdate from tb_vocabulary where vo_eng=?");
            sql.append("select stu_num, stu_name, stu_hp, stu_gender, stu_regdate from tb_student where stu_num like ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,"%"+word+"%");
            rs = pstmt.executeQuery();
            while (rs.next()){
                isFind = true;
                String num = rs.getString("stu_num");
                String name = rs.getString("stu_name");
                String hp = rs.getString("stu_hp");
                String gender = rs.getString("stu_gender");
                String regdate = rs.getString("stu_regdate");
                System.out.println("학번: " + num + ", " + "이름: " + name +" (" +  "연락처:" + hp + ", " + "성별:" + gender + "자) - " + "[등록일: " +regdate + "]");
            }

            if(!isFind) System.out.println("찾는 단어가 없습니다.");

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
        System.out.print("수정할 학생의 학번을 입력하세요 > ");
        String num = sc.next();
        System.out.print("이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 > ");
        String hp = sc.next();
        System.out.print("성별을 입력하세요(남/여) > ");
        String gender = sc.next();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set stu_name=? , stu_hp=? , stu_gender=? where stu_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,name);
            pstmt.setString(2,hp);
            pstmt.setString(3,gender);
            pstmt.setString(4,num);
            int result = pstmt.executeUpdate();
            if(result>=1) System.out.println("학생 수정 성공!");
            else System.out.println("학생 수정 실패!");
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
        System.out.print("삭제할 학생의 학번을 입력하세요 > ");
        String num = sc.next();

        //delete from tb_student where stu_num = ?;
        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where stu_num=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,num);
            int result = pstmt.executeUpdate();
            if(result>=1) System.out.println("학생 삭제 성공!");
            else System.out.println("학생 삭제 실패!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
}
