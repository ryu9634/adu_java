class OverlodingTest{
    void cat(){
        System.out.println("고양이의 이름은 만식이 나이는 3살입니다."); //메소드 오버로딩
    }
    void cat(String name){
        System.out.println(name+"의 나이는 3살입니다.");   //메소드 오버로딩
    }
    void cat(int age){
        System.out.println(age+"살 고양이의 이름은 만식이 입니다.");     //메소드 오버로딩
    }

}
public class Overloding {
    public static void main(String[] args) {
        OverlodingTest ot = new OverlodingTest();

        ot.cat();
        ot.cat(10);
        ot.cat("냐옹이");
    }
}
