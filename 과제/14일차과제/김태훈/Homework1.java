import java.util.Random;

class Maskfact{
    private int stock;
    Random r = new Random();

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public synchronized void push(){
        int a = r.nextInt(10) + 1;
        this.stock += a;
        System.out.println(" 마스크 " + a + "개 생산(총 " + stock + "개 남음)");
        if(this.stock >= 10){
            notify();
        }
    }

    public synchronized void sell(){
        int a = r.nextInt(10) + 1;
        if(this.stock - a >= 0) {
            this.stock -= a;
            System.out.println(" 고객 " + a + "개 구매(총 " + stock + "개 남음)");
        }else if(this.stock - a < 0){
            System.out.println("마스크 갯수가 모자라 잠시 판매가 중지되었습니다.");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Factory extends Thread{
    private Maskfact maskfact;

    public Factory(Maskfact maskfact){
        this.maskfact = maskfact;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            maskfact.push();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread{
    private Maskfact maskfact;

    public Customer(Maskfact maskfact){
        this.maskfact = maskfact;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            maskfact.sell();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Homework1 {
    public static void main(String[] args) {
          Maskfact maskfact = new Maskfact();
          Thread push = new Factory(maskfact);
          Thread sell = new Customer(maskfact);
          push.start();
          sell.start();

    }
}
