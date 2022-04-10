public class LocalClass {
    private int num1 = 10;

    public void method1(){
        int num2 = 20;

        class Local {
            // 외부에서 접근이 안되야 하는데....
            private int num3 = 30;
            private final int num4 = 40;

            public void method2(){
                System.out.println("num1 : " + num1);
                System.out.println("num2 : " + num2);
                System.out.println("num3 : " + num3);
            }
        }
        Local local = new Local();
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.method1();
    }
}
