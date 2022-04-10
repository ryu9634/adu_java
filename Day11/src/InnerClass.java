class OuterClass {
    private int num1 = 10;

    public void method1(){
        System.out.println("num1 : " + num1);
    }

    public void printInner(){
        InnerClass innerClass = new InnerClass();
        innerClass.method2();
    }

    class InnerClass {
        private int num2 = 20;
        public void method2() {
            System.out.println("OuterClass.num1 : " + num1);
            System.out.println("InnerClass.num2 : " + num2);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.method1();
        outerClass.printInner();
        System.out.println();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.method2();
    }
}
