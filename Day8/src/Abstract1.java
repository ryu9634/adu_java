abstract class Abstract1 {

    private int num;

    public void print(){
        System.out.println("Abstract1 클래스의 print() 호출!");
    }

    // 추상 클래스를 만드려면 적어도 1개이상의 추상 메소드가 존재해야 함
    public abstract int plus(int num1, int num2);

}
