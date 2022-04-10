class Mask implements Runnable{
    int mask=0;
    int result=0;
    int r = (int)(Math.random()*10)+1;

    public void push(){         // 마스크를 생성하는 매소드
        System.out.println("마스크를 생산 합니다");
        mask=0;

        while(true) {

            mask +=r;
            System.out.println("마스크를 총" + mask + "개 생산했습니다");
            try {
                Thread.sleep( 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            result+=mask;
            System.out.println(result+"개");
            mask=0;
            if (result >50) {
                System.out.println("마스크가 총 " + result + "개 만들어졌습니다");
                System.out.println("생산 작업을 중지합니다");break;
            }

        }
    }


    public void sell(){         //마스크를 판매하는 메소드
        System.out.println("마스크를 판매합니다");

        while(result>=1) {
            result -= r;
            if(result<0){
                System.out.println("잠시만 기다려 주세요");break;
            }
            System.out.println("마스크가"+r+"개 판매되었습니다");
            System.out.println("마스크가"+result+"개 남았습니다");

            if(result<1){
                System.out.println("잠시만 기다려주세여");break;}
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
       while(true) {
           push();
           sell();
       }

    }


}

public class Customer {
    public static void main(String[] args) {
        Mask mask = new Mask();
        Thread k9 = new Thread(mask);
        k9.start();
    }
}
