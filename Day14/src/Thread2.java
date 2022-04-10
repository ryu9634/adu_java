public class Thread2 extends Thread {
    int seq;

    public Thread2(int seq){
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + "쓰레드 시작!");
        try{
            Thread.sleep(1000); // 1초
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(this.seq + " 쓰레드 종료!");
    }

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Thread t = new Thread2(i);
            t.start();
        }
        System.out.println("main 쓰레드 종료!");
    }
}
