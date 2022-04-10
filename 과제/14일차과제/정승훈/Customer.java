public class Customer extends Thread {

    private Market market;      // Market 클래스 객체 생성

    public Customer(Market market){
        this.market = market;
    }

    public void run() {
        while(true) {
            market.sell();      // Market 클래스의 sell 메소드 호출
            try{
                Thread.sleep(1000);     // 1초 단위로 생산
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}