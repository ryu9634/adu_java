/* 오버로딩 */
class Car5{
    private String name = "밴츠";
    private int maxSpeed = 250;
    private String color;

    public Car5(String color){
        this.color = color;
    }

    public Car5(String name, int maxSpeed, String color) { // 오버로딩
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Day7Homework6번 {
    public static void main(String[] args) {
        Car5 car1 = new Car5("아우디", 230, "흰색");
        Car5 car2 = new Car5("검은색");

        System.out.println(car1);
        System.out.println(car2);
    }
}
