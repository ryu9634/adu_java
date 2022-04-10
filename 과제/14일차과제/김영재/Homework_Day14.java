class Mask {
    private int masknum;

    public synchronized void push(){
        int rd = (int)(Math.random()*10)+1;
        this.masknum += rd;
        System.out.println("마스크 " + rd +"개 생산 (총 " + masknum + "개 남음)");
        if(this.masknum >= 10){
            notify();
        }
    }

    public synchronized void sell(){
        int rd = (int)(Math.random()*10) + 1;
        if(this.masknum - rd >= 0) {
            this.masknum -= rd;
            System.out.println("고객 " + rd + "개 구매 (총 " + masknum + "개 남음)");
        }else if(this.masknum - rd < 0){
            System.out.println("수량 부족");
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread{
    private Mask mask;

    public Customer(Mask mask){
        this.mask = mask;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                mask.sell();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Factory extends Thread{
    private Mask mask;

    public Factory(Mask mask){
        this.mask = mask;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                mask.push();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class Homework_Day14 {
    public static void main(String[] args) {
     Mask mask = new Mask();
     Customer customer = new Customer(mask);
     Factory factory = new Factory(mask);

     customer.start();
     factory.start();
    }
}