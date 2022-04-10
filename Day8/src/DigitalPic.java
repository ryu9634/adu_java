public class DigitalPic implements Movable {

    String tools = "컴퓨터";

    @Override
    public void move(int x, int y) {
        System.out.println("DigitalPic Move : (" + x + ", " + y + ")");
    }

    @Override
    public void test() {
        System.out.println("테스트 모드로 그림을 그립니다");
    }
}
