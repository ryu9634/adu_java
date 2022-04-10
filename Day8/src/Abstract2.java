public class Abstract2 extends Abstract1 {
    // Abstract1에 있는 추상 메소드를 반드시 오버라이딩 해야함!

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
}
