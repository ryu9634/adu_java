public class ATM implements Runnable {

    private int money = 10000000;

    public synchronized void withdraw(int money){
        this.money -= money;
        System.out.println(Thread.currentThread().getName() + "가 " + money + "원 출금");
        System.out.println("잔액 : " + this.money + "원");
    }

    @Override
    public void run() {
        //synchronized (this) {
            for (int i = 0; i < 10; i++) {
                withdraw(10000);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        // }
    }
}
