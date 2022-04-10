public class TypeConv {
    public static void main(String[] args) {
        byte var1 = 10;
        int var2 = var1;    // byte -> int, 자동 형변환
        System.out.println(var2);

        int var3 = 200;
        byte var4 = (byte)var3; // 강제 형변환, -128 ~ 127
        System.out.println(var4);

        char var5 = 'A';    // 2byte 유니코드
        int var6 = var5;    // 자동 형변환
        System.out.println(var6);

        int var7 = 10;
        double var8 = 3.0;
        int var9 = 3;
        System.out.println(var7 / var9);    // 정수 / 정수 = 정수
        System.out.println(var7 / var8);    // 정수 / 소수 = 소수
    }
}
