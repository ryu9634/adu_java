public class Homework {
    public static void main(String[] args) {
        Mask mask = new Mask();
        Thread MaskFactory = new Thread(mask);
        MaskFactory.start();
    }
}

class Mask implements Runnable{
    int mask = 0;
    int result = 0;
    int r = (int)(Math.random() * 10) + 1;

    public void push(){
        System.out.println("마스크 생산 시작");
        mask = 0;

        while(true) {
            mask += r;
            System.out.println(mask + "개 생산완료");
            try {
                Thread.sleep( 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            result += mask;
            System.out.println("마스크 재고: " + result + "개");
            mask = 0;
            if (result > 100) {
                System.out.println("총 생산량: " + result);
                System.out.println("생산 작업을 중지합니다");
                break;
            }
        }
    }

    public void sell(){
        System.out.println("마스크 판매 시작");

        while(result>=1) {
            result -= r;
            if(result<0){
                System.out.println("마스크 생산 중");
                break;
            }
            System.out.println(r + "개 판매완료");
            System.out.println("남은 마스크: " + result);

            if(result < 1){
                System.out.println("마스크 생산중");
                break;
            }try {
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