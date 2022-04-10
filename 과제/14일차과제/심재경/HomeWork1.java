class HomeClass {
    private int count;

    public synchronized void sell(int count) {
        while (this.count <= 10) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.count -= count;
        System.out.print(Thread.currentThread().getName() + " " + count + "개 구매");
        System.out.println(" 총 " + this.count + "개");
    }

    public synchronized void push(int count) {
        this.count += count;
        System.out.print(Thread.currentThread().getName() + " " + count + "개 생산");
        System.out.println(" 총 " + this.count + "개");
        notify();

    }
}


class Mask extends Thread {
    private HomeClass homeClass;

    public Mask(HomeClass homeClass) {
        this.homeClass = homeClass;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            homeClass.push((int) (Math.random() * 10 + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class Customer extends Thread {
    private HomeClass homeClass;

    public Customer(HomeClass homeClass) {
        this.homeClass = homeClass;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            homeClass.sell((int) (Math.random() * 10 + 1));
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
        HomeClass homeClass = new HomeClass();
        Thread push = new Thread(new Mask(homeClass));
        Thread sell = new Thread(new Customer(homeClass));

        push.start();
        sell.start();

    }
}
