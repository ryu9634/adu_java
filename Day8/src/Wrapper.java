public class Wrapper {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = new Integer(num1); // 박싱
        System.out.println(num2);

        int num3 = num2 + 100;
        System.out.println(num3);

        int num4 = num2.intValue(); // 언박싱
        System.out.println(num4);

        Integer num5 = new Integer(10);
        Integer num6 = 10;
        Integer num7 = 5;

        Integer result1 = num5 + num6;
        System.out.println(result1);
        Integer result2 = num1 + num7;
        System.out.println(result2);

        System.out.println(num1 == num2);   // true
        System.out.println(num5 == num6);   // false
        System.out.println(num5.intValue() == num6.intValue()); // true
    }
}
