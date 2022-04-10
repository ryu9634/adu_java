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

    public void input() throws SQLException {
        sc=new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name=sc.next();
        System.out.println("전화번호를 입력하세요");
        String hp=sc.next();
        System.out.println("성별을 입력하세요");
        String gender=sc.next();
        try {
            conn=Dbconn.getConnection();
            sql=new StringBuilder();
            sql.append("insert into tb_student (st_name, st_hp, st_gender) values (?,?,?)");
            pstmt=conn.prepareStatement(sql.toString());
            pstmt.setString(1,name);
            pstmt.setString(2,hp);
            pstmt.setString(3,gender);
            int result=pstmt.executeUpdate();
            if(result>=1){
                System.out.println("정보가 입력되었습니다.");
            }else System.out.println("정보입력에 실패하였습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt=null;
        }

    }

    public void list() throws SQLException{
        try{
            conn=Dbconn.getConnection();
            sql=new StringBuilder();
            sql.append("select st_idx, st_name, st_hp, st_gender, st_regdate from tb_student order by st_name asc");
            pstmt=conn.prepareStatement(sql.toString());
            rs=pstmt.executeQuery();
            while (rs.next()){
                int idx=rs.getInt("st_idx");
                String name=rs.getString("st_name");
                String hp=rs.getString("st_hp");
                String gender=rs.getString("st_gender");
                String regdate=rs.getString("st_regdate");
                System.out.println("학번: "+idx+", 학생이름: "+name+", 연락처: "+hp+", 성별: "+gender+", 등록일자: "+regdate);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt=null;
        }


    }

    public void edit() throws SQLException{
        sc=new Scanner(System.in);
        System.out.println("정보를 수정할 학생의 학번을 입력하세요.");
        int idx=sc.nextInt();
        System.out.println("새 이름을 입력하세요. ");
        String name=sc.next();
        System.out.println("새로운 연락처를 입력하세요.");
        String hp=sc.next();
        try {
            conn = Dbconn.getConnection();
            sql=new StringBuilder();
            sql.append("update tb_student set st_name=?, st_hp=? where st_idx=?");
            pstmt=conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            pstmt.setString(2,hp);
            pstmt.setInt(3,idx);
            int result=pstmt.executeUpdate();
            if(result>=1) System.out.println("정보 수정하였습니다.");
            else System.out.println("정보가 수정되지 않았습니다.");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt=null;
        }

    }

    public void delete() throws SQLException{
        sc=new Scanner(System.in);
        System.out.println("삭제할 학생의 학번을 입력하세요");
        int input=sc.nextInt();
        try {
            conn=Dbconn.getConnection();
            sql=new StringBuilder();
            sql.append("delete from tb_student where st_idx=?");
            pstmt=conn.prepareStatement(sql.toString());
            pstmt.setInt(1,input);
            int result=pstmt.executeUpdate();
            if(result>=1) System.out.println("삭제되었습니다.");
            else System.out.println("해당 정보를 찾을 수 없습니다.");

        }catch (Exception e){
            e.printStackTrace();
        } finally {
                Dbconn.dbclose();
                pstmt.close();
                pstmt=null;

        }
    }

}
