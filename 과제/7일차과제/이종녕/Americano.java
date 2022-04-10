public class Americano extends Coffee{

    private String tasty1 ;
    private String tasty2 ;

    public Americano(){

    }



    public Americano(String menu, int price, String from, String color, String tasty1, String tasty2) {
        super(menu, price, from, color);
        this.tasty1 = tasty1;
        this.tasty2 = tasty2;
    }

    public String getTasty1() {
        return tasty1;
    }

    public void setTasty1(String tasty1) {
        this.tasty1 = tasty1;
    }

    public String getTasty2() {
        return tasty2;
    }

    public void setTasty2(String tasty2) {
        this.tasty2 = tasty2;
    }

    void info1(){
        System.out.println("자식 클래스의 메소드");
    }
    void info1(String name1){
        System.out.println("자식 클래스의 String 값의 메소드");

    }

    @Override   //오버 라이딩하여 부모클래스의 메소드 출력값을 재정의 했다
    public void print() {
        System.out.println("맛있는 아메리카노 입니다.");
    }

    @Override
    public String toString() {
        return super.toString()+ "Americano{" +
       // return "Americano{" +
                "tasty1='" + tasty1 + '\'' +
                ", tasty2='" + tasty2 + '\'' +
                '}';
    }
}

