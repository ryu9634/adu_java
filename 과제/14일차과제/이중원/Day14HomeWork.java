import java.util.Random;
/*
    마스크 공장 프로그램 만들기

        Mask class
            sell() : 마스크를 판매
            push() : 마스크를 생산 (랜덤하게 생산 -> 1초단위로)

        Customer class
            run() : 마스크를 구입 (랜덤하게 구입 -> 1초단위로)

     1. 마스크 생산과 고객의 쓰레드를 만들기
     2. 마스크 생산은 랜덤하게 (1 ~ 10 1초마다) 생산
     3. 고객은 1초마다 랜덤하게 구입
     4. 마스크의 개수가 모자르면 고객의 쓰레드는 잠시 멈춤
     (마스크의 개수가 10이 넘으면 다시 고객의 쓰레드는 대기)
*/
class Mask {
    private int products;

    public synchronized void push(){
        int randomPush = (int)(Math.random()*10) + 1;
        this.products += randomPush;
        System.out.println(randomPush + "개 생산 (총 " + products + "개 남음)");
        if(this.products >= 10){
            notify();
        }
    }

    public synchronized void sell(){
        int randomSell = (int)(Math.random()*10) + 1;
        if(this.products - randomSell >= 0) {
            this.products -= randomSell;
            System.out.println(randomSell + "개 구매 (총 " + products + "개 남음)");
        }else if(this.products - randomSell < 0){
            System.out.println("수량 부족");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread {
    private Mask mask;

    public Customer(Mask mask) {
        this.mask = mask;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                mask.sell();
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

public class Day14HomeWork {
    public static void main(String[] args) {
        Mask mask = new Mask();
        Customer customer = new Customer(mask);
        Factory factory = new Factory(mask);

        customer.start();
        factory.start();
    }
}
