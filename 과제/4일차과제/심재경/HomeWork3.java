public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("로또 번호 예측");

        for (int i = 1; i <= 6; i++) {
            double random = Math.random();
            int lotto = (int) (random * 45) + 1;
            System.out.print(lotto + "\t");
        }
    }
}
