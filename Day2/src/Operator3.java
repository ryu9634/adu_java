public class Operator3 {
    public static void main(String[] args) {
        int var1 = 10, var2 = 3;

        boolean result = var1 > var2;   // true
        System.out.println(result);

        result = var1 < var2;
        System.out.println(result);

        result = var1 >= var2;  // 크거나 같다 true
        System.out.println(result);

        result = var1 <= var2;  // 작거나 같다 false
        System.out.println(result);

        result = var1 == var2;
        System.out.println(result);

        result = var1 != var2;
        System.out.println(result);
    }
}
