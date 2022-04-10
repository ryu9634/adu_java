public class For2 {
    public static void main(String[] args) {
        int sum = 0;
//        for (int i = 2; i <= 100; i = i + 2) {
//            sum = sum + i;
//        }
        for (int i = 2; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println("1~100까지의 짝수의 합 : " + sum);
    }
}