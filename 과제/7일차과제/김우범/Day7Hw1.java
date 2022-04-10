/*과제.
        아래 용어에 대해 조사하고 예제를 만들어보자.
        - 상속
        - 접근 제어자
        - super 키워드
        - this 키워드
        - 생성자
        - 오버로딩
        - 오버라이딩*/

// 1.상속 : 자식(클래스)이 원하는 부모(클래스)를 선택하여 물려받는다. (부모 클래스의 필드와 메서드)
public class ParentBook {   // Class 1
    String name;
    int price;

    public void print() { // 접근 제어자 : 외부와의 접근, 제어를 허용 및 금지 가능
        System.out.println("책의 이름과 가격" + name + price);
    }
}

public class ChildBook extends ParentBook {  // Class2
    ChildBook(String name, int price) { // 5.생성자 : 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 함.
        this.name = name;  //  ChildBook이 ParetBook의 필드를 상속받아서 가능한 선언
        this.price = price;
        super("나의 라임오렌지나무",10000);// 3.super : 부모클래스의 객체임을 나타냄, 자식클래스 생성자 앞에 붙어야함
                                        //  ChildBook (){           //자식 생성자
                                        // ex) super("나의 라임오렌지 나무", 10000);
    }


    public static void main(String[] args) {
        ChildBook Child = new ChildBook("나의 라임오렌지 나무", 10000);
        System.out.print("[책의 이름과 가격] ");
        Child.Print();
    }

}
// 6. 오버로딩 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
class OverloadingTest{
    public String cat1;
    public void info(){     // info 메서드 사용 후

    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    @Override
    public String toString() {
        return "OverloadingTest{" +
                "cat1='" + cat1 + '\'' +
                '}';
    }

    void cat(){
        System.out.println("부모클래스");



    }
}
public class overTest {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        String cat1; // 부모클래스로부터 상속 받음

        ot.cat();   // 7.오버라이딩 : 부모클래스에서 가져와 같은이름의 다른 메서드가 됨. (재정의)
        ot.cat("오버로딩으로 불러온 값.");
        cat1.info(); // 부모클래스에서 info메서드를 불러옴.
    }

}
