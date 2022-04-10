public class Exception1 {
    public static void main(String[] args) {
        try {
//            int num = 10;
//            int result = num / 0;
//            System.out.println(result);

//            String str = null;
//            System.out.println(str.length());

//            int[] num = new int[3];
//            num[0] = 100;
//            num[3] = 10;
            String str = "1000 ";
            System.out.println(Integer.parseInt(str));
        }catch(ArithmeticException e){
            // System.out.println("ArithmeticException 처리완료!");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("NullPointerException 처리완료!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 처리완료!");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException 처리완료!");
        }
        System.out.println("프로그램을 종료합니다");
    }
}
