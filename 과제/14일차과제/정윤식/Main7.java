public class Main7 {
    public static void main(String[] args) {


        Masknow masknow=new Masknow();


        Thread sell=new Customer(masknow);
        Thread push=new Factory(masknow);
        sell.start();
        push.start();
    }
}
