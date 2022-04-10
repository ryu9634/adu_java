public class User {
    String id;
    String name;
    String pass;
    int age;
    double point;

    public void info(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("비밀번호 : " + pass);
        System.out.println("나이 : " + age);
        System.out.println("포인트 : " + point);
    }
}
