//    메소드를 구현할 클래스 - ㅅ푸시, 셀
//    쓰레드를 상속받은 클래스 2개 - 메소드를 구현할 클래스를 객체불러오고
//            마켓 - 푸  커스터머 - 셀


import java.util.Random;

class Method0 {
    private int mask;
    Random r = new Random();

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public synchronized void push() {
        int add = r.nextInt(10)+1;
        this.mask += add;
        System.out.println(add + "개의 마스크가 입고되었어요 (" + mask + "개 남음)");
        if (this.mask >= 10) {
            notify();
        }
    }

    public synchronized void sell() {
        int add = r.nextInt(10)+1;
        if (this.mask - add > 0) {
            this.mask -= add;
            System.out.println(add + "개의 마스크를 구매하려고 해요.");
            System.out.println(add + "개의 마스크가 출고되었어요 (" + mask + "개 남음)");
        } else if (this.mask - add < 0) {
            System.out.println(add + "개의 마스크를 구매하려고 해요.");
            int result = add-this.mask;
            System.out.println(result + "개의 마스크가 모자랍니다.");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Cust extends Thread{
    private Method0 method0;

    public Cust(Method0 method0) {
        this.method0 = method0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            method0.sell();
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Market extends Thread{
    private Method0 method0;

    public Market(Method0 method0) {
        this.method0 = method0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            method0.push();
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class HomeWork1 {
    public static void main(String[] args) {

        Method0 method0 = new Method0();
        Thread push = new Market(method0);
        Thread sell = new Cust(method0);

        push.start();
        sell.start();
    }
}
