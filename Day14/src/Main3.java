class TestRunnable implements Runnable {

    public void run() {
        System.out.println("쓰레드 동작중 ...");
        thread2();
    }

    public void thread2(){
        System.out.println("쓰레드 동작중2 ...");
        thread3();
    }

    public void thread3(){
        System.out.println("쓰레드 동작중3 ...");
    }
}

public class Main3 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start!");
        Runnable r = new TestRunnable();
        Thread th1 = new Thread(r);
        th1.start();
        try {
            th1.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end!");
    }
}
