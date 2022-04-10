public class Random1 {
    public static void main(String[] args) {
        // 0 ~ 0.99999999
        double random = Math.random();
        System.out.println("랜덤한 수 : " + random); // 0.5526680155178587

        // 0.5526680155178587
        // random * 10  // 5.526680155178587
        int num = (int)(random * 10); // 5 (범위는 0 ~ 9)
        System.out.println(num);

        // 1 ~ 45까지 랜덤하는 숫자를 추출
        int num2 = (int)(random * 45) + 1;  // (범위는 1 ~ 45)
        System.out.println(num2);
    }
}
