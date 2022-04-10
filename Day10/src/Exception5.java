public class Exception5 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    public static void method1() throws Exception{
        method2();
    }

    public static void method2() throws Exception{
        System.out.println("method2() 호출!");
//        Exception e = new Exception("예외가 발생!");
//        throw e;

//        try {
//            throw new Exception("예외가 발생!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        throw new Exception("예외가 발생!");
    }
}
