/* 접근 제어자 */
class Car1{
    private String name;
    private int price;
    public static int speed = 0;

    public Car1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void upSpeed(){
        speed += 10;
        System.out.println("속도를 올립니다 : " + speed);
    }

    public static void downSpeed(){
        speed -= 10;
        System.out.println("속도를 내립니다: " + speed);
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Day7Homework2번 {
    public static void main(String[] args) {
        Car1 car = new Car1("제네시스", 45000000);

        System.out.println(car);

        int random = (int)(Math.random()*10+1);

        for(int i = 1; i < random; i++){
            car.upSpeed();
        }
        Car1.downSpeed();

    }
}
