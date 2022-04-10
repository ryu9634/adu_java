public class Main2 {
    public static void main(String[] args) {
        // Drawable drawable = new Drawable();
        Circle circle = new Circle();
        circle.drawPrint("원의 넓이를 구함");
        circle.setColor("파랑");
        circle.printInfo(); // 인스턴스 메소드 호출

        DigitalPic digitalPic = new DigitalPic();
        digitalPic.move(10, 5);
        digitalPic.test();

        Shape shape = new Shape();
        shape.move(5, 7);
        shape.test();
        shape.drawPrint("도형을 그리고 있음");
        shape.setColor("핑크");

        Drawable drawable = new Shape();
        drawable.drawPrint("그림을 그립니다");
        drawable.setColor("골드");
        // drawable.test(); 사용하지 못함
        // drawable.move(); 사용하지 못함

        Movable movable = new Shape();
        movable.move(5, 3);
        movable.test();
        // movable.drawPrint(); 사용하지 못함
        // movable.setColor(); 사용하지 못함

        // static으로 처리된 필드와 메소드
        System.out.println("MAX : " + Drawable.MAX);
        Drawable.staticMethod();

    }
}
