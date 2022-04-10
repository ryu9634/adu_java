public class Shape implements Drawable, Movable {

    String name = "도형";

    @Override
    public void drawPrint(String msg) {
        System.out.println("Shape drawPrint() 호출 : " + msg);
    }

    @Override
    public void setColor(String color) {
        System.out.println("Shape setColor() 호출 : " + color);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Shape move() 호출 : " + x + ", " + y);
    }

    @Override
    public void test() {
        System.out.println("Shape test() 호출");
    }
}
