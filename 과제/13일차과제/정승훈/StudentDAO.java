import java.sql.*;
import java.util.Scanner;

public class StudentDAO {
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException{       // 학생등록
        sc = new Scanner(System.in);
        System.out.println("학번을 입력하세요.");
        int num = sc.nextInt();
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("휴대폰번호를 입력하세요,");
        String hp = sc.next();
        System.out.println("성별을 입력해 주세요");
        String gender = sc.next();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_num, st_name, st_hp, st_gender)").append(" values(?, ?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, num);
            pstmt.setString(2, name);
            pstmt.setString(3, hp);
            pstmt.setString(4, gender);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("회원등록 완료!");
            else System.out.println("회원등록 실패!");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException{         // 학생 목록
        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_num, st_name, st_hp, st_gender, st_regdate from tb_student order by st_num asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while(rs.next()){
                int num = rs.getInt("st_num");
                String name = rs.getString("st_name");
                String hp = rs.getString("st_hp");
                String gender = rs.getString("st_gender");
                String date = rs.getString("st_regdate");
                System.out.println("("+num+"," + name + ","+ hp + "," + gender+ "," + date +")");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void edit() throws SQLException{         // 학생정보 수정
        sc = new Scanner(System.in);
        System.out.println("수정할 학생의 학번을 입력하세요.");
        int num = sc.nextInt();
        System.out.println("수정할 이름을 입력하세요");
        String name = sc.next();
        System.out.println("수정할 휴대폰 번호를 입력하세요");
        String hp = sc.next();
        System.out.println("수정할 성별을 입력하세요");
        String gender = sc.next();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name = ?, st_hp = ?, st_gender = ? where st_num = ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,name);
            pstmt.setString(2, hp);
            pstmt.setString(3, gender);
            pstmt.setInt(4,num);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("수정이 완료되었습니다.");
            else System.out.println("수정을 실패하였습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            pstmt.close();
            pstmt = null;
            Dbconn.dbclose();
        }
    }

    public void delete() throws SQLException{           // 학생정보 삭제
        System.out.println("삭제할 학생의 학번을 입력하세요");
        int num = sc.nextInt();

        try{
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_num = ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1,num);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("삭제되었습니다.");
            else System.out.println("삭제를 실패했습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
}
