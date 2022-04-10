public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("th1 Thread가 동작하고 있어요");
    }

    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
    }
}
