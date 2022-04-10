import java.util.Random;

class Product {
    private int mask;
    Random ran = new Random();

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }


    public synchronized void push() {
        int ma = ran.nextInt(10) + 1;
        this.mask += ma;
        System.out.println("[ 마스크 생산 : " + ma + "개 ] [ 마스크 재고 : " + mask + " 개 ]");
        if (mask >= 10) {
            notify();
        }

    }

    public synchronized void sell() {
        int ma = ran.nextInt(10) + 1;
        if (this.mask - ma >= 0) {
            this.mask -= ma;
            System.out.println("[ 마스크 구입 : " + ma + "개 ] [ 잔량" + mask+ " ]");
        } else if (this.mask - ma <= 0) {
            System.out.println("          마스크 재고 부족            ");
            System.out.println("************** 생산중 **************");
            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}


class MaskPr extends Thread {

    private Product product;

    public MaskPr(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
             product.sell();
             try {
                 Thread.sleep(1000);
             }catch (Exception e){
                 e.printStackTrace();
             }
        }

        }
}


class Customer extends Thread {
    private Product product;

    public Customer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            product.push();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class HomeWork {
    public static void main(String[] args) {
        Product product = new Product();

        Thread push = new MaskPr(product);

        Thread sell = new Customer(product);

        push.start();
        sell.start();




    }
}
