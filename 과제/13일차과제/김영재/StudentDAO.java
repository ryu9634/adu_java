import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.SortedMap;

public class StudentDAO {
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException{ //학생 등록 메소드 생성
        sc = new Scanner(System.in);
        System.out.print("학번을 입력하세요 > ");
        int stnum = sc.nextInt();
        System.out.print("이름을 입력하세요 > ");
        String name = sc.next();
        System.out.print("연락처를 입력하세요 > ");
        String pnum = sc.next();
        System.out.print("성별을 입력하세요 > ");
        String gender = sc.next();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_student (st_stnum, st_name, st_pnum, st_gender)")
               .append(" values (?, ?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1,stnum);
            pstmt.setString(2,name);
            pstmt.setString(3, pnum);
            pstmt.setString(4, gender);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("학생 등록 완료!");
            else System.out.println("학생 등록 실패!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
    public void list() throws SQLException{ // 학생 리스트 출력 메소드 생성
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select st_stnum, st_name, st_pnum, st_gender from tb_student order by st_stnum");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()){
                int stnum = rs.getInt("st_stnum");
                String name = rs.getString("st_name");
                String pnum = rs.getString("st_pnum");
                String gender = rs.getString("st_gender");
                System.out.println("***************"+ "\n학번 :" + stnum + "\n이름 :" + name + "\n연락처 :"
                        + pnum + "\n성별 :" + gender + "\n***************");
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
    public void edit() throws SQLException{ // 학생 정보 수정 메소드 생성
        sc = new Scanner(System.in);
        System.out.print("수정할 학생의 학번을 입력하세요 > ");
        int stnum = sc.nextInt();
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("연락처를 입력하세요");
        String pnum = sc.next();
        System.out.println("성별을 입력하세요");
        String gender = sc.next();
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_student set st_name = ?, st_pnum = ?, st_gender = ? where st_stnum = ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,name);
            pstmt.setString(2,pnum);
            pstmt.setString(3,gender);
            pstmt.setInt(4,stnum);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("학생 정보 수정 완료!");
            else System.out.println("학생 정보 수정 실패!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void delete() throws SQLException{ // 학생 정보 삭제 메소드 생성
        sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 학번을 입력하세요 > ");
        int stnum = sc.nextInt();
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_student where st_stnum = ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1,stnum);
            int result = pstmt.executeUpdate();
            if (result >= 1) System.out.println("학생 정보 삭제 완료!");
            else System.out.println("학생 정보 삭제 실패!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
}
