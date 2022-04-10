/* 생성자 */
class Car4{
    private String name;
    private int maxSpeed;
    private String Color;

    public Car4(String name, int maxSpeed, String color) { // 생성자
        this.name = name;
        this.maxSpeed = maxSpeed;
        Color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", Color='" + Color + '\'' +
                '}';
    }
}

public class Day7Homework5번 {
    public static void main(String[] args) {
        Car4 car = new Car4("아우디", 250, "파랑");

        System.out.println(car);
    }
}
