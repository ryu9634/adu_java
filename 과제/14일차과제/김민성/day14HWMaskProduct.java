public class day14HWMaskProduct {
    package day14HWMaskProduct;

    public class MaskProduct extends Thread {
        private Mask mask;

        public MaskProduct(Mask mask) {
            this.mask = mask;
        }

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(1500);
                    mask.push();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
