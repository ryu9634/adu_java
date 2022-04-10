// 과제) 접근제어자
public class HomeWork2 {
    public void print_public(){
        System.out.println("public");
    }
    protected void print_protected(){
        System.out.println("protected");
    }
    void print_default(){
        System.out.println("default");
    }
    private void print_private(){
        System.out.println("private");
    }

    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2(); // 내부 클래스 객체 생성
        homeWork2.print_public();       // 가능
        homeWork2.print_protected();    // 가능
        homeWork2.print_default();      // 가능
        homeWork2.print_private();      // 가능

        HomeWork2_A homeWork2_a = new HomeWork2_A(); // 동일 패키지 내 클래스 객체 생성
        homeWork2_a.print_public();     // 가능
        homeWork2_a.print_protected();  // 가능
        homeWork2_a.print_default();    // 가능
//      homeWork2_a.print_private();    // 오류




    }
}
