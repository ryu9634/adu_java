/*
    super 키워드란?
    - 상속의 관계에서 해당 클래스의 부모 클래스를 나타낸다.
    - super 키워드를 사용함으로써 코드의 중복성을 제거할 수 있다.
 */

class Ex_parent{
    Ex_parent(){}
    void print(){
        System.out.println("A의 print()메서드 호출");
    }
}
class Ex_child extends Ex_parent{
    Ex_child(){
        super();
    }
    void call(){
        super.print();
        System.out.println("자식클래스에서 부모의 print() 메서드를 호출하였습니다.");
    }
}
public class Super {
    public static void main(String[] args) {
        Ex_child child = new Ex_child();
        child.call();
    }
}
