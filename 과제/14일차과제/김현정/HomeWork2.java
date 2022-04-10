public class HomeWork2 {
    public static void main(String[] args) {
        HomeWorkClass homeWorkClass = new HomeWorkClass();
        Thread push = new Thread(new Mask(homeWorkClass), "마스크");
        Thread sell = new Thread(new Customer(homeWorkClass), "고객");

        push.start();
        sell.start();

    }
}