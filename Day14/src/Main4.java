class CountThread extends Thread {
    public CountThread(String name){
        setName(name);
    }

    public void run(){
        for(int i=0; i<10000; i++){
            System.out.println(getName());
        }
        System.out.println(getName() + "끝!");
    }
}

public class Main4 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            Thread th = new CountThread("Th" + i);
            if(i == 10){
                th.setPriority(Thread.MAX_PRIORITY);
            }else{
                th.setPriority(Thread.MIN_PRIORITY);
            }
            th.start();
        }

    }
}
