public class Operator6 {
    public static void main(String[] args) {
        int var1 = 10, var2 = 3;

        boolean result1 = var1 > var2;  // true
        boolean result2 = var1 <= var2; // false
        boolean result3 = result1 && result2;   // false
        boolean result4 = result1 || result2;   // true
        boolean result5 = !result1; // false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
