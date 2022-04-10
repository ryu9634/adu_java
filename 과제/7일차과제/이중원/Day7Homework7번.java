/* 오버라이딩 */
class Hello{
    String name = "자두";
    public void print(){
        System.out.println("안녕 " + name);
    }
}

class Bye extends Hello{
    @Override
    public void print(){
        System.out.println("잘가 " + super.name);
    }
}

public class Day7Homework7번 {
    public static void main(String[] args) {
        Hello hello1 = new Hello();
        hello1.print();

        Hello hello2 = new Bye();
        hello2.print();
    }
}
