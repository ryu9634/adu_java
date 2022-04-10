// this 예제
class Mom {
    public String site = "Kim";
    public int period = 6;

    public void PrintKim() { System.out.println(site + "의 사이트입니다." +
            "사이트는 만들어진지 " + period + "년이 됐습니다."); } }

class Kid extends Mom{
    String site ="Lee";
    int period = 10;

    public void Printkim() {
        System.out.println(this.site + "의 사이트입니다." + "사이트는 만들어진지" + this.period +"년이 됐습니다");
    }

}

public class Homework_Day07_3 {
    public static void main(String[] args) {
        Kid k = new Kid();
        k.Printkim();
    }


}
