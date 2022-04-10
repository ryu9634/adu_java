/*
    오버라이딩(Overriding)이란?
    - 부모 클래스에 있는 메서드를 자식클래스가 재 정의하는 것을 뜻한다.
    - 메서드명과 시그니처 리턴타입이 동일해야 하며, 오버라이딩시 부모의 메서드 접근제어자보다
    - 범위가 넓거나 같아야 한다.
    - 단, 인스턴스 메서드만 오버라이딩이 가능하고
    - 정적 메서드는 오버라이딩이 불가능하다.
    - 왜 ? : static(정적)으로 생성된 메서드는 각각 클래스의 해당 static (정적)
    - 메모리 영역으로 들어가기 때문에 오버라이딩을 하여도 덮어씌우지 못한다.
 */

class Or1{
    int a = 1;
    public void print(){
        System.out.println("Or1의 print");
    }
    public static void st_print(){
        System.out.println("Or1의 static print()");
    }
}
class Or2 extends Or1{
    int a = 2;
    public void print(){
        System.out.println("Or2의 print");
    }
    public static void st_print(){
        System.out.println("Or2의 static print()");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Or1 or1 = new Or1();
        or1.print();            // Or1의 print
        Or1.st_print();         // Or1의 static print()
        System.out.println();

        Or2 or2 = new Or2();
        or2.print();            // Or2의 print
        Or2.st_print();         // Or2의 static print()
        System.out.println();

        Or1 or12 = new Or2();
        or12.print();           // Or2의 print
        or12.st_print();        // Or1의 static print()
        System.out.println(or12.a);

    }
}
