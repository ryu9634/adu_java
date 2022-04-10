public class Variable1 {
    public static void main(String[] args) {
        byte var1;      // 변수의 선언
        // System.out.println(var1); 에러 : 초기화 되지 않음
        var1 = 10;      // 변수의 초기화
        // byte var1 = 10;
        System.out.println(var1);

        int var2 = 15; int var3 = 20;
        int var4 = 30, var5 = 40;
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        long var6 = 3000000000L;
        System.out.println(var6);
    }
}
