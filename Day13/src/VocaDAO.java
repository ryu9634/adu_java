import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class VocaDAO {
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insert() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 > ");
        String eng = sc.next();
        System.out.print("단어의 뜻을 입력하세요 > ");
        String kor = sc.next();
        System.out.print("레벨을 입력하세요 > ");
        int lev = sc.nextInt();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("insert into tb_vocabulary (vo_eng, vo_kor, vo_level)");
            sql.append(" values (?, ?, ?)");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, eng);
            pstmt.setString(2, kor);
            pstmt.setInt(3, lev);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("단어 등록 성공!");
            else System.out.println("단어 등록 실패!");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void list() throws SQLException {
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("select vo_eng, vo_kor, vo_level, vo_regdate from tb_vocabulary order by vo_eng asc");
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while(rs.next()){
                String eng = rs.getString("vo_eng");
                String kor = rs.getString("vo_kor");
                int lev = rs.getInt("vo_level");
                String regdate = rs.getString("vo_regdate");
                System.out.println(eng + " : " + kor + "(" + lev + ", " + regdate + ")");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }

    public void search() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("검색할 단어를 입력하세요 > ");
        String word = sc.next();
        try {
            boolean isFind = false;
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            // sql.append("select vo_eng, vo_kor, vo_level, vo_regdate from tb_vocabulary where vo_eng=?");
            sql.append("select vo_eng, vo_kor, vo_level, vo_regdate from tb_vocabulary where vo_eng like ?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, "%"+word+"%");
            rs = pstmt.executeQuery();

            while(rs.next()){
                isFind = true;
                String eng = rs.getString("vo_eng");
                String kor = rs.getString("vo_kor");
                int lev = rs.getInt("vo_level");
                String regdate = rs.getString("vo_regdate");
                System.out.println(eng + " : " + kor + "(" + lev + ", " + regdate + ")");
            }

            if(!isFind) System.out.println("찾는 단어가 없습니다");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
            rs.close();
            rs = null;
        }
    }

    public void edit() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("수정할 단어를 입력하세요 > ");
        String eng = sc.next();
        System.out.print("단어의 뜻을 입력하세요 > ");
        String kor = sc.next();
        System.out.print("레벨을 입력하세요 > ");
        int lev = sc.nextInt();

        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("update tb_vocabulary set vo_kor=?, vo_level=? where vo_eng=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, kor);
            pstmt.setInt(2, lev);
            pstmt.setString(3, eng);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("단어 수정 성공!");
            else System.out.println("단어 수정 실패!");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }

    public void delete() throws SQLException {
        sc = new Scanner(System.in);
        System.out.print("삭제할 단어를 입력하세요 > ");
        String word = sc.next();
        try {
            conn = Dbconn.getConnection();
            sql = new StringBuilder();
            sql.append("delete from tb_vocabulary where vo_eng=?");
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, word);
            int result = pstmt.executeUpdate();
            if(result >= 1) System.out.println("단어 삭제 성공!");
            else System.out.println("단어 삭제 실패!");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            Dbconn.dbclose();
            pstmt.close();
            pstmt = null;
        }
    }
}
