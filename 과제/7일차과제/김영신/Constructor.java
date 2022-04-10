/*
    생성자(Constructor) 란?
    - 객체를 생성할 때 필요하며 생성간 객체의 필드를 초기화 하는 역할을 하는 메서드
    - 리턴타입이 없고 메서드명이 클래스명과 동일해야 한다.
    - 클래스 설계시 생성자를 작성하지 않으면 자바 컴파일러가 자동적으로 기본생성자를 만들어 주며
    이 생성자는 클래스명(){}의 빈 형태이다.
    - 단 생성자를 하나라도 작성을 한 경우 자바 컴파일러가 자동적으로 기본 생성자를 만들어 주지 않는다.

    상속에서의 생성자 :
    자식클래스가 부모클래스의 기능을 물려받기 위해서는 부모클래스의 객체를 먼저 힙메모리에 로딩시켜야 한다
    만약 자식클래스의 생성자와 부모클래스의 생성자를 작성하지 않고 자식클래스의 객체를 생성한다면
    자바 컴파일러는 부모,자식 클래스의 기본 생성자를 작성하고 자식클래스의 기본 생성자안에 super();
    를 작성하여 부모 객체를 먼저 힙 메모리에 올려두고 자식 객체를 만든다.

    생성자 사용법
    참조데이터타입 참조변수명 = new 생성자
    new로 생성자를 호출하게 되면 객체가 힙 메모리에 로딩되고 참조변수는 그 객체의 위치값을 저장하게 된다.

 */

class Constructor1{
    private String name;
    public Constructor1(){System.out.println("부모의 기본 생성자가 호출 되었습니다.");}
    public Constructor1(String name){this.name = name;}
    public String getName() {return name;}
}

class Constructor2 extends Constructor1{
    public Constructor2(){System.out.println("자식의 기본 생성자가 호출 되었습니다.");}
    public Constructor2(String name) { super(name); }
}

class Constructor3 extends Constructor2{
    public Constructor3(){System.out.println("손자의 기본 생성자가 호출 되었습니다.");}
    public Constructor3(String name) { super(name); }
}

public class Constructor{
    public static void main(String[] args) {
        Constructor2 c = new Constructor2();
        // 결과 : 부모의 기본 생성자가 호출 되었습니다.
        //       자식의 기본 생성자가 호출 되었습니다.
        System.out.println();
        Constructor3 c3 = new Constructor3(); // 부모 - > 자식 -> 손자 호출
        Constructor3 nametest = new Constructor3("김영신");
        System.out.println("이름 : " + nametest.getName());
    }
}
