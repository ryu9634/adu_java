import java.util.Random;

class Masknow{
    private int stock;
    Random random = new Random();

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public synchronized void push(){
        int x = random.nextInt(10) + 1;
        this.stock += x;
        System.out.println(" 마스크 " + x + "개 생산(총 " + stock + "개 남음)");
        if(this.stock >= 10){
            notify();
        }
    }

    public synchronized void sell(){
        int x = random.nextInt(10) + 1;
        if(this.stock - x >= 0) {
            this.stock -= x;
            System.out.println(" 고객 " + x + "개 구매(총 " + stock + "개 남음)");
        }else if(this.stock - x < 0){
            System.out.println("마스크 개수가 모자릅니다. 잠시 판매가 중지되었습니다. 생산중...");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Factory extends Thread{
    private Masknow masknow;

    public Factory(Masknow masknow){
        this.masknow = masknow;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            masknow.push();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread{
    private Masknow masknow;

    public Customer(Masknow masknow){
        this.masknow = masknow;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            masknow.sell();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}