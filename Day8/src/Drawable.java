public interface Drawable {

    // interface에 일반 필드로 변수를 작성하면 JVM이 알아서 변경
    int MAX = 100;  // -> public static final int MAX = 100;


    // interface 일반 메소드로 작성하면 JVM이 알아서 변경
    public void drawPrint(String msg);  // -> public abstract void drawPrint(String msg);
    public void setColor(String color); // -> public abstract void setColor(String color);

    // 인스턴스 메소드(자바 8부터 ~)
    public default void printInfo(){
        System.out.println("Drawable 인터페이스의 printInfo() 호출!");
    }

    // static 메소드
    public static void staticMethod(){
        System.out.println("Drawable 인터페이스의 staticMethod() 호출!");
    }
}
