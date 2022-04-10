public class PrintThread1 extends Thread {

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            if(i%2 == 0){
                System.out.println("👍 PrintThread1 : " + i);
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
