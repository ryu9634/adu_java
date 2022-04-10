public class Exception4 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("예외를 발생합니다 !");
            throw e;
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료합니다");
    }
}
