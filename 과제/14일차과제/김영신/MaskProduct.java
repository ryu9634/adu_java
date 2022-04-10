package HomeWork;

public class MaskProduct extends Thread {
    private Mask mask;

    public MaskProduct(Mask mask) {
        this.mask = mask;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                mask.push();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
