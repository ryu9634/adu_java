public class Operator5 {
    public static void main(String[] args) {
        int var1 = 100, var2 = 100, var3 = 100, var4 = 100, var5 = 100;

        var1 += 10; // var1 = var1 + 10;
        var2 -= 10;
        var3 *= 10;
        var4 /= 10;
        var5 %= 10;

        System.out.println("var1 += 10 : " + var1);
        System.out.println("var2 -= 10 : " + var2);
        System.out.println("var3 *= 10 : " + var3);
        System.out.println("var4 /= 10 : " + var4);
        System.out.println("var5 %= 10 : " + var5);
    }
}
