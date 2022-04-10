/* 상속 */
class Person {
    String name;
    int age;
}

class Man extends Person {
    String sex;

    public void print(String name, int age, String sex) {
        System.out.println("name : " + name + "age : " + age + "sex : " + sex);
    }
}


public class Day7Homework1번 {
    public static void main(String[] args) {
        Man man = new Man();
        man.print("김사과", 20, "남");
    }
}
