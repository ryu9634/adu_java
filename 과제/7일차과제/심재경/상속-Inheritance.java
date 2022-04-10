class A {
    String afield = "클래스 A 필드 ";
    int ab ;

    public A(){

    }


    public A(String afield) {
        this.afield = afield;
    }

    public A(int ab ) {
        this.ab = ab;
    }

    public void aMethod() {
        System.out.println(afield);
    }

}

class B extends A {
    String bfiled = "클래스 B 필드 ";

    public void bmethod() {
        System.out.println(afield);// 부모 필드 사용
        System.out.println(bfiled);// 자식 필드 사용
    }
}

class C extends B {
    String cfilde = "클래스 C 필드 ";

    public void cmethod() {
        System.out.println(afield); //A 부모 필드 사용
        System.out.println(bfiled); //B 부모 필드 사용
        System.out.println(cfilde); // 자식 필드 사용
    }

}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("---------");
        A a = new A();
        a.aMethod();  // 본인 메소드 사용
        System.out.println("----A----");
        System.out.println();

        B b = new B();
        b.aMethod(); //부모 메소드 사용
        b.bmethod(); //본인 메소드 사용
        System.out.println("----B----");
        System.out.println();

        C c = new C();
        c.aMethod(); //A부모 메소드 사용
        c.bmethod(); //B부모 메소드 사용
        c.cmethod(); //본인 메소드 사용
        System.out.println("----C----");
        System.out.println();


    }
}
