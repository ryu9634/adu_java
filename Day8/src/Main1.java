public class Main1 {
    public static void main(String[] args) {
        // Abstract1 abstract1 = new Abstract1(); // 추상 클래스는 객체생성을 하지 못함
        Abstract2 abstract2 = new Abstract2();
        int result = abstract2.plus(10, 5);
        System.out.println(result);
    }
}
