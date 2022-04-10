public class Generic1 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2();
        box2.setT("안녕하세요");
        System.out.println(box2.getT());

        Box2<Integer> box22 = new Box2();
        box22.setT(10);
        System.out.println(box22.getT());

        Apple apple = new Apple("사과", 1000, "빨강", "청송", 7);
        Box2<Apple> box23 = new Box2();
        box23.setT(apple);

        Apple apple2 = box23.getT();
        System.out.println(apple2);


    }
}
