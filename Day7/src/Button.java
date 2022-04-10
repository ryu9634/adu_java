public class Button {
//    private int count = 0;
    private static int count = 0; // 모든 객체가 공유하게 됨(공용변수)

    public void click(){
        count++;
        System.out.println("고객님의 대기번호는 " + count + "입니다");
    }
}
