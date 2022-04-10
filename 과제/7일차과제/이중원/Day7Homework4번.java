/* this 키워드 */
class Car3{
    private String name;
    private int maxSpeed;
    private String color;

    public Car3(String name, int maxSpeed, String color) {
        this.name = name; // this
        this.maxSpeed = maxSpeed; // this
        this.color = color; // this
    }

    public Car3(){
        this("아우디", 200, "흰색"); // this
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

public class Day7Homework4번 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        System.out.println(car1);

        Car3 car2 = new Car3("벤츠", 230, "검정");
        System.out.println(car2);
    }
}
