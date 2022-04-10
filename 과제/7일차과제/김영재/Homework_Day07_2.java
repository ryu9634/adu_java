// super 예제
class Mother {
    public String site = "Kim";
    public int period = 6;

    public void PrintKim() { System.out.println(site + "의 사이트입니다." +
            "사이트는 만들어진지 " + period + "년이 됐습니다."); } }

class Child extends Mother{
    String site ="Lee";
    int period = 10;

    public void Printkim() {
        super.PrintKim();
        System.out.println(super.site + "의 사이트입니다." + "사이트는 만들어진지" + super.period +"년이 됐습니다");
    }

}

public class Homework_Day07_2 {
    public static void main(String[] args) {
    Child c = new Child();
    c.PrintKim();
    }


}



