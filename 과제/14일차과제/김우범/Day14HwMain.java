class Mask {
    private int mask;

    public synchronized void push() {
        int rP = (int) (Math.random() * 10) + 1;
        this.mask += rP;
        System.out.println("공장 : " + rP + "개 생산완료 (잔량 = " + mask + "개)");
        if (this.mask >= 10) {
            notify();

        }
    }


    public synchronized void sell() {
        int rS = (int) (Math.random() * 10) + 1;
        if (this.mask - rS >= 0) {
            this.mask -= rS;
            System.out.println("고객 : " + rS + "개 구입완료 (잔량 = " + mask + "개)");
        } else if (this.mask - rS < 0) {
            System.out.println("재고 부족");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

//    public synchronized void method1(){
//        int ov = 20;
//        if (this.mask - ov >= ov) {
//            this.mask -= ov;
//            System.out.println("🎁 품질유지기한 지난 상품 전량 폐기 (잔량 = " + mask + "개");
//            notify();
//        }try {
//
//    }catch (Exception e){
//        e.printStackTrace();
//    }
//    }
}

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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Factory extends Thread {
    private Mask mask;

    public Factory(Mask mask) {
        this.mask = mask;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                mask.sell();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//class Trash extends Thread {
//    private Mask mask;
//
//    public Trash(Mask mask) {
//        this.mask = mask;
//    }
//
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(1000);
//            mask.method1();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//}

public class Day14HwMain {
    public static void main(String[] args) {
        Mask mask = new Mask();
        Customer customer = new Customer(mask);
        Factory factory = new Factory(mask);
//        Trash trash = new Trash(mask);

        customer.start();
        factory.start();
//        trash.start();


    }
}