public class Fruit {
    private String name;
    private int price;
    private String color;
    private String from;

    public Fruit(){

    }

    public Fruit(String name, int price, String color, String from) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "과일명='" + name + '\'' +
                ", 가격=" + price +
                ", 색상='" + color + '\'' +
                ", 원산지='" + from + '\'' +
                '}';
    }
}
