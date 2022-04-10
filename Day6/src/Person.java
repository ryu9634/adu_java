public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private boolean isLover;

    public Person() {
        this.name = "무명";
        this.age = 0;
        this.height = 0.0;
        this.weight = 0.0;
        this.isLover = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLover() {
        return isLover;
    }

    public void setLover(boolean lover) {
        this.isLover = lover;
    }

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("애인여부 : " + isLover);
    }
}
