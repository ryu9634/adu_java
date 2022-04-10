/*super 키워드*/
class Car2{
    String name = "아우디";
    int price = 600000000;

    public Car2(){

    }

    public Car2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Benz extends Car2{
    int maxSpeed;

    public Benz(String name, int price, int maxSpeed) {
        super(name, price);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return  super.toString() + "Benz{" +
                ", speed=" + maxSpeed +
                '}';
    }
}
public class Day7Homework3번 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        System.out.println(car1);
        Car2 benz = new Benz("밴츠", 500000000, 100);
        System.out.println(benz);
    }
}
