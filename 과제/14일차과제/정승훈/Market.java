import java.util.*;

public class Market{
    private int inventory;              // 마스크 개수를 담을 전역변수
    Random random = new Random();

    public int getInventory() {return inventory;}
    public void setInventory(int inventory) {this.inventory = inventory;}

    public synchronized void push() {    // 마스크 생산
        int ea = (int)(Math.random()*10) +1;
        this.inventory += ea;           // 재고에 만들어진 마스크 추가
        System.out.println("✔ 마스크 " + ea + "개 생산(재고량 : " + inventory + "개)");
        if(this.inventory >= 10){       // 마스크가 10개 이상이면 재실행
            notify();
        }
    }

    public synchronized void sell(){    // 마스크 판매
        int ea = (int)(Math.random()*10) +1;
        if(this.inventory - ea >= 0) {  // 마스크가 0개 이상이면 판매
            this.inventory -= ea;       // 재고에서 판매한 마스크 빼기
            System.out.println("🎁 고객 " + ea + "개 구매(재고량 : " + inventory + "개)");
        }else if(this.inventory - ea <= 0){     // 마스크가 0개 이하이면 판매 중지
            System.out.println("---------------------------------------");
            System.out.println("고객이 "+ea+"개 구입 예정");
            System.out.println("😂마스크가 재고가 없습니다. 잠시만 기다려주세요.");
            System.out.println("---------------------------------------");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}