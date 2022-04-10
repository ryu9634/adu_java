public class Oop2 {
    public static void main(String[] args) {
        Member apple = new Member();
        // apple.userid = "apple"; // private으로 필드를 설정하면 접근이 안됨
        // System.out.println(apple.userid);
        apple.setUserid("apple");
        System.out.println(apple.getUserid());

        apple.setName("김사과");
        System.out.println(apple.getName());

        Member banana = new Member();

        banana.setUserid("banana");
        System.out.println(banana.getUserid());
        banana.setName("반하나");
        System.out.println(banana.getName());

        Member orange = new Member("orange", "1234", "오렌지", "orange@orange.com", "남자");
        orange.info();

        Member cherry = new Member("cherry", "000");
        cherry.info();
    }
}
