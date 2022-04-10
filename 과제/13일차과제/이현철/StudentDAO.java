import java.sql.*;
import java.util.Scanner;

public class StudentDAO {
    Connection conn;
    Scanner sc;
    StringBuilder sql;
    PreparedStatement pstmt;
    ResultSet rs;

public void Input() throws SQLException {
   sc=new Scanner(System.in);
    String name;
    String phone;
    String gender;

    System.out.println("등록할 학생의 이름을 입력해 주세요");
    name=sc.next();
    System.out.println("등록할 학생의 연락처를 입력해 주세요");
    phone=sc.next();
    System.out.println("등록할 학생의 성별을 입력해 주세요");
    gender=sc.next();

    try{

        conn =Dbconn.getConnection();
        sql= new StringBuilder();
        sql.append("insert into tb_student(st_name,st_phone,st_gender)");
        sql.append("values(?,?,?)");
        pstmt=conn.prepareStatement(sql.toString());
        pstmt.setString(1,name);
        pstmt.setString(2,phone);
        pstmt.setString(3,gender);
        int result =pstmt.executeUpdate();
        if(result>=1) System.out.println("학생을 등록했습니다.");
        else System.out.println("학생을 등록하지 못했습니다");

    }catch (Exception e){
        e.printStackTrace();
    }finally {
        Dbconn.dbclose();
        pstmt.close();
        pstmt=null;
    }
}
public void list() throws SQLException {
    try{
        conn =Dbconn.getConnection();
        sql= new StringBuilder();
        sql.append("select st_name,st_phone st_gender,st_regdate from tb_student order by st_num asc");
       pstmt=conn.prepareStatement(sql.toString());
        rs=pstmt.executeQuery();
        while(rs.next()){
            String name = rs.getString("st_name");
            String phone = rs.getString("st_phone");
            String gender = rs.getString("st_gender");
            String regdate = rs. getString("st_regdate");
            System.out.println("이름 : "+name+", 핸드폰번호 : "+phone+"성별 : "+gender+", 입력시간 : "+regdate+")");
        }
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        Dbconn.dbclose();
        pstmt=null;
        pstmt.close();
        pstmt=null;
    }
}
public void edit() throws SQLException {
sc=new Scanner(System.in);
    System.out.println("수정할 학생을 입력하세요");
    String name = sc.next();
    System.out.println("번호를 입력하세요");
    String phone = sc.next();
    System.out.println("성별을 입력하세요");
    String gender =sc.next();

    try {
        conn =Dbconn.getConnection();
        sql=new StringBuilder();
        sql.append("update tb_student set st_name=?,st_phone=?,st_gender=? where st_name=?");
        pstmt=conn.prepareStatement(sql.toString());
        pstmt.setString(1,name);
        pstmt.setString(2,phone);
        pstmt.setString(3,gender);
        int result = pstmt.executeUpdate();
        if(result >= 1) System.out.println("학생정보 수정완료");
        else System.out.println("학생정보 수정실패");
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        Dbconn.dbclose();
        pstmt.close();
        pstmt=null;
    }
}
public void Delete() throws SQLException {
    Scanner sc= new Scanner(System.in);
    System.out.println("삭제할 이름을 입력하세요");
    String name =sc.next();
    try{
        conn = Dbconn.getConnection();
        sql=new StringBuilder();
        sql.append("delete from tb_student where st_name=?");
        pstmt = conn.prepareStatement(sql.toString());
        pstmt.setString(1,name);
        int result = pstmt.executeUpdate();
        if(result>=1) System.out.println("삭제가 되었습니다");
        else System.out.println("삭제가 실패했습니다");

    }catch (Exception e){
        e.printStackTrace();
    }finally {
        Dbconn.dbclose();
        pstmt.close();
        pstmt= null;
    }
}
}
