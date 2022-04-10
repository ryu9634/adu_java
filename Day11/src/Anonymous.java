interface Inter1 {
    void method1();
}

class TestClass1 implements Inter1 {
    @Override
    public void method1() {
        System.out.println("Inter1을 구현한 클래스");
    }
}

interface Inter2 {
    String method2();
}

class TestClass2 implements Inter2 {
    @Override
    public String method2() {
        return "실명 클래스";
    }
}

class TestClass3 {
    public void method3(Inter2 inter2){
        System.out.println(inter2.method2());
    }
}

public class Anonymous {
    public static void main(String[] args) {
        TestClass2 testClass2 = new TestClass2();
        TestClass3 testClass3 = new TestClass3();

        testClass3.method3(testClass2);

        testClass3.method3(new TestClass2(){
            @Override
            public String method2() {
                return "익명 객체!";
            }
        });
    }
}
