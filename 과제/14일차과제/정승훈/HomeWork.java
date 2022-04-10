public class HomeWork {
    public static void main(String[] args) {
        Market market = new Market();
        Thread push = new Factory(market);
        Thread sell = new Customer(market);
        push.start();
        sell.start();

    }
}