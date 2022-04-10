package dayHW14MaskProduct;
import java.util.Random;

public class dayHW14MaskProduct{
    private int having = 50;
    private Random random = new Random();
    private boolean isMade = true;
    private boolean signal = false;

    public synchronized void sell() throws InterruptedException {
        if (!isMade && !signal) wait();
        if (signal) return;

        int ran = random.nextInt(20) + 1;
        having -= ran;
        System.out.println("고객님 " + ran + "개 구매 (총 " + having + "개)");
        isMade = false;

        if (having <= 0) {
            System.out.println("마스크 개수가 부족합니다");
            isMade = true;
            signal = true;
            wait();
            return;
        }

    }


    public synchronized void push() throws InterruptedException {
        if (isMade && !signal) wait();
        if (signal) {
            pushProcess();
            if (having >= 5){
                signal = false;
                System.out.println("재판매를 시작합니다.");
            }
            return;
        }
        pushProcess();
        isMade = true;

    }

    private void pushProcess() {
        int ran = random.nextInt(5) + 1;
        having += ran;
        System.out.println("마스크 " + ran + "개 생산 (총 " + having + "몇개)");
    }
}




























