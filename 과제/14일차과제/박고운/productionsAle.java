class productionsAle {
    private int save;
    public synchronized void push(int save) { // 동기화 메소드, 마스크 저장
        this.save += save;
        System.out.println(Thread.currentThread().getName() + " " + save +
                "개 생산 (총 " + this.save + "개)");
        notify();
    }

    public synchronized void sell(int save) { // 동기화 메소드, 마스크 판매

        while (this.save <= 10) {
             /*
       마스크의 개수가 모자르면 고객의 쓰레드는 잠시 멈춤
       (마스크의 개수가 10를 넘으면 다시 고객의 쓰레드는 대기)
        */
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
        System.out.println(Thread.currentThread().getName() + " " + save +
                "개 구매 (총 " + this.save + "개)");
    }
}

class Mask extends Thread { //마스크 스레드
    private productionsAle Productionsale;

    public Mask(productionsAle Productionsale) {
        this.Productionsale = Productionsale;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Productionsale.push((int) (Math.random() * 10 + 1));
            try { //컴퓨터 속도가 빨라서 수행결과를 잘 확인 할 수 없기 때문에 Thread.sleep() 메소드를 이용해서
                Thread.sleep(1000);// // Thread.sleep() 메소드은 천천히 출력하게 해준다.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread {
    private productionsAle Productionsale;

    public Customer(productionsAle Productionsale) {
        this.Productionsale = Productionsale;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Productionsale.sell((int) (Math.random() * 10 + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


