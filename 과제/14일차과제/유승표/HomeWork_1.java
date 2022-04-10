class HomeWorkClass {
    private int save;

    //동기화
    public synchronized void push(int save) { // 마스크 생산 후 저장하는 메소드
        this.save += save;
        System.out.println(Thread.currentThread().getName() + " " + save + "개 생산 (총 " + this.save + "개)");
        notify();
    }

    public synchronized void sell(int save) { // 마스크를 판매하는 메소드
        while (this.save <= 10) {  // 마스크의 개수가 10를 넘으면 다시 고객의 쓰레드는 대기
            try {
                wait();
                if (save <= 0){
                    System.out.println("마스크 개수가 모자라 잠시 판매가 중지되었습니다");
                }
                return;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.save -= save;
        System.out.println(Thread.currentThread().getName() + " " + save + "개 구매 (총 " + this.save + "개)");
    }
}

class Mask extends Thread {
    private HomeWorkClass homeWorkClass;

    public Mask(HomeWorkClass homeWorkClass) {
        this.homeWorkClass = homeWorkClass;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            homeWorkClass.push((int) (Math.random() * 10 + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread {
    private HomeWorkClass homeWorkClass;

    public Customer(HomeWorkClass homeWorkClass) {
        this.homeWorkClass = homeWorkClass;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            homeWorkClass.sell((int) (Math.random() * 10 + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
