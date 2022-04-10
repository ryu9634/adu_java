public class Main2 {
    public static void main(String[] args) {
        ATM cuATM = new ATM();

        Thread apple = new Thread(cuATM, "김사과");
        Thread banana = new Thread(cuATM, "반하나");
        Thread orange = new Thread(cuATM, "오렌지");
        Thread melon = new Thread(cuATM);
        apple.start();
        banana.start();
        orange.start();
        melon.start();
    }
}
