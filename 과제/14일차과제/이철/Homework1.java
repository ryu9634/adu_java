//과제
//마스크 공장 프로그램 만들기
//    Mask
//    sell() : 마스크를 판매
//    push()  : 마스크를 생산   (랜덤 5, 3, .. 1000초)
//    Customer
//    run() : 마스크를 구입
//1. 마스크 생산과 고객의 쓰레드를 만들기
//2. 마스크 생산은 랜덤하게(1~10 1초마다) 생산
//3. 고객은 1초마다 랜덤하게 구입
//4. 마스크의 개수가 모자르면 고객의 쓰레드는 잠시 멈춤
//(마스크의 개수가 10를 넘으면 다시 고객의 쓰레드는 대기)
//마스크 4개 생산 (총 ..개)
//마스크 3개 생산 (총 ..개)
//고객 2개 구매 (총 ..개)
//고객 5개 구매 (총 ..개)
//...
//마스크 개수가 모자라 잠시 판매가 중지되었습니다
//마스크 4개 생산
//...

import java.util.Random;

class Mask1 {
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
        System.out.println(ma + "개의 마스크가 입고 (현재 마스크는 " + mask + "개 남음)");
        if (this.mask >= 10) {
            notify();
        }
    }

    public synchronized void sell() {
        int num = ran.nextInt(10) + 1;
        if (this.mask - num > 0) {
            this.mask -= num;
            System.out.println(num + "개의 마스크가 출고 (현재 마스크는 " + mask + "개 남음)");
        } else if (this.mask - num < 0) {
            System.out.println(num + "개의 마스크를 구매");
            int result = num - this.mask;
            System.out.println(result + "개의 마스크가 부족");
            System.out.println("********** 생산중 **********");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread {
    private Mask1 mask1;

    public Customer(Mask1 mask1) {
        this.mask1 = mask1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            mask1.sell();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Market extends Thread {
    private Mask1 mask1;

    public Market(Mask1 mask1) {
        this.mask1 = mask1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            mask1.push();
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

        Mask1 mask1 = new Mask1();

        Thread push = new Market(mask1);

        Thread sell = new Customer(mask1);

        push.start();
        sell.start();
    }
}