public class maskFactory {
    public static void main(String[] args) {
        productionsAle Productionsale = new productionsAle();
        Thread push = new Thread(new Mask(Productionsale), "마스크");
        Thread sell = new Thread(new Customer(Productionsale), "고객");

        push.start();
        sell.start();

    }
}