class HomeWorkClass {
    private int save;
    public synchronized void sell(int save) {
        while (this.save <= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.save -= save;
        System.out.println(Thread.currentThread().getName() + " " + save + "개 구매 (총 " + this.save + "개)");
    }
    public synchronized void push(int save) {
        this.save += save;
        System.out.println(Thread.currentThread().getName() + " " + save + "개 생산 (총 " + this.save + "개)");
        notify();
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
public class HomeWork1 {
    public static void main(String[] args) {
        HomeWorkClass homeWorkClass = new HomeWorkClass();
        Thread push = new Thread(new Mask(homeWorkClass), "마스크");
        Thread sell = new Thread(new Customer(homeWorkClass), "고객");

        push.start();
        sell.start();

    }
}
