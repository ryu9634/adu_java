package HomeWork;

import java.util.Random;

public class Mask {
    private int having = 0;
    private Random random = new Random();
    private boolean isMade = false;
    private boolean signal = false;

    public synchronized void sell() throws InterruptedException {
        if (!isMade) wait();
        int ran = random.nextInt(10) + 1;

        if (having - ran <= 0) {
            System.out.println("────────────────────────");
            System.out.println("마스크 개수가 모자라 잠시 판매가 중단됩니다.");
            System.out.println();
            isMade = false;
            signal = true;
            notify();
            wait();
            return;
        }

        having -= ran;
        System.out.println("고객 " + ran + "개 구매 (총 " + having + "개)");
        System.out.println("────────────────────────");
        isMade = false;
        notify();
    }


    public synchronized void push() throws InterruptedException {
        if (isMade) wait();
        if (signal) {
            pushProcess();
            if (having >= 10) {
                signal = false;
                System.out.println();
                System.out.println("판매가 다시 시작됩니다.");
                System.out.println("────────────────────────");
            }
            return;
        }
        pushProcess();
        isMade = true;
        notify();
    }



    //  부가적인 메서드
    private void pushProcess() {
        int ran = random.nextInt(10) + 1;
        having += ran;
        System.out.println("마스크 " + ran + "개 생산 (총 " + having + "개)");
    }
}