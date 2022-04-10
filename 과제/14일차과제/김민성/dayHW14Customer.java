package dayHW14Customer;

public class Customer extends Thread{
    private Mask mask;

    public Customer(Mask mask) {
        this.mask = mask;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
                mask.sell();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}