public class Object1 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("안녕하세요");    // String
        System.out.println(box.getObj());

        box.setObj(10);
        System.out.println(box.getObj());

        Apple apple = new Apple("사과", 1000, "빨강", "청송", 7);
        box.setObj(apple);
        System.out.println(box.getObj());

        Apple apple2 = (Apple) box.getObj();
        System.out.println(apple2);

    }
}
