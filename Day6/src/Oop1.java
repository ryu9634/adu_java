public class Oop1 {
    /*
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
     */
    public static void main(String[] args) {
        User user = new User();
        user.id = "apple";
        user.name = "김사과";
        user.pass = "1234";
        user.age = 20;
        user.point = 100;

        user.info();
        System.out.println();

        User member = new User();
        member.id = "banana";
        member.name = "반하나";
        member.pass = "1010";
        member.age = 23;
        member.point = 100;
        member.info();
    }
}
