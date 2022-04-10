// 김영신 예제
class CountThread1 extends Thread{

    public  CountThread1(String name){
        setName(name);
    }
    @Override
    public void run() {
        for (long i = 0; i < 5000000000L; i++) {
        }
        System.out.println(getName() + "종료");
    }
}

public class Main5 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Thread th = new CountThread1("Th" + i);
            if(i==10){
                th.setPriority(Thread.MAX_PRIORITY);
            }else {
                th.setPriority(Thread.MIN_PRIORITY);
            }
            th.start();
        }
    }
}
