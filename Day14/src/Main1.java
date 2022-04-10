public class Main1 {
    public static void main(String[] args) {
        Thread th1 = new PrintThread1();
        Runnable r1 = new PrintThread2();
        Thread th2 = new Thread(r1);

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    if(i%2 == 0){
                        System.out.println("😎 익명클래스 : " + i);
                    }
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread th4 = new Thread( () -> {
            for(int i=0; i<10; i++){
                if(i%2 == 0){
                    System.out.println("💋 람다를 사용한 익명클래스 : " + i);
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        for(int i=0; i<10; i++){
            if(i%2 == 0){
                System.out.println("❤ 메인 : " + i);
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
