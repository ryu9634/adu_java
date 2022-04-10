public class Child extends Parent {
    Child(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Child child= new Child("정사과", 25);
        System.out.println("결과");
        child.Print();
    }


}

/*
상속이란?
자바에는 상속(Inheritance)이라는 개념이 존재합니다.

쉽게 말해 부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며, 자식 클래스는 부모 클래스를 선택해서, 그 부모의 멤버를 상속받아 그대로 쓸 수 있게 됩니다.

상속을 하는 이유는 간단합니다. 이미 마련되어 있던 클래스를 재사용해서 만들 수 있기 때문에 효율적이고, 개발 시간을 줄여주게 됩니다.

상속을 하더라도 자식 클래스가 부모의 모든 것들을 물려받는 것은 아닙니다.

부모 클래스의 private 접근 제한을 갖는 필드 및 메소드는 자식이 물려받을 수 없습니다.
부모와 자식 클래스가 서로 다른 패키지에 있다면, 부모의 default 접근 제한을 갖는 필드 및 메소드도 자식이 물려받을 수 없습니다.
(default 접근 제한은 ‘같은 패키지에 있는 클래스’만 접근이 가능하게끔 하는 접근 제한자이기 때문입니다.)
그 이외의 경우는 모두 상속의 대상이 됩니다.

*/
