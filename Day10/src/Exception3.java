public class Exception3 {
    public static void main(String[] args) {
        try {
            Class object = Class.forName("com.koreait.test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료합니다");
    }
}
