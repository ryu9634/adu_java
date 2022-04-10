public class Coffee {

    private String menu;
    int price;
    public String from;
    protected String color;
    //접근 제어자

    public Coffee() {

    }

    public Coffee(String menu, int price, String from, String color) {
        this.menu = menu;
        this.price = price;
        this.from = from;
        this.color = color;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void print() {
        System.out.println("어서오세요 카페 입니다.");
    }

    void info(String name){
        System.out.println(name);

    }
     void info(int age ){
         System.out.println(age);
     }



    @Override
    public String toString() {
        return "Coffee{" +
                "메뉴='" + menu + '\'' +
                ", 가격=" + price +
                ", 원산지='" + from + '\'' +
                ", 색상='" + color + '\'' +
                '}';
    }
}
