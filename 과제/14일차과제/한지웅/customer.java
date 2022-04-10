class Customer extends Thread {
    private Mask mask;

    public Customer(Mask mask) {
        this.mask = mask;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                mask.push();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Factory extends Thread {
        private Mask mask;

        public Factory(Mask mask) {
            this.mask = mask;
        }
    }
}