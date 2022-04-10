/*
상속
- 어떠한 객체의 필드나 메서드들을 하위 클래스로 물려주는 걸 상속이라고 한다
    이 상하 관계에 따라 자식클래스 혹은 부모클래스라고 불리게 된다.
    private의 접근 제어자는 이 상속에서 제외된다.
    상속의 기능이 있어 다형성Polymorphism적 표현이 가능하다.
    ✔ 다형성 : 하나의 클래스가 여러가지의 모습을 할 수 있는 것

상속을 하는 방법
- class 클래스명 extends 부모클래스가 될 클래스명{}

! 다중 상속이 안되는 이유
    다중 상속이 된다고 가정하에 C클래스는 A클래스와 B클래스를 상속했다고 하고
    A,B클래스는 내부에 메서드명이 print()인 메서드가 각각 1개씩 있다고 하자.
    C클래스는 상속받은 print()를 호출할 때 둘다 똑같은 print()라 애매모호한 상태가 된다
    이러한 이유로 다중상속은 불가능하다.
*/
class A{
    public void print(){
        System.out.println("hi");
    }
}
class B extends A{}
public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.print();
//        System.out.println(b.b);      private 접근제어자는 해당 클래스 안에서만 접근이 가능하다
        A ab = new B();             //  상속 때문에 다형적 표현이 가능하다.
    }
}
