public class homework1_day7 {

    // 상속이란? : 부모 클래스에서 데이터와 메소드를 물려받아 중복 코드를 줄이는 것
    // 방법: 자식클래스명 extents 부모클래스명 {}
    class Parants{
        int a1;
        int a2;
        public Parants(){

        }
        public Parants(int a1, int a2) {
            this.a1 = a1;
            this.a2 = a2;
        }
    }

    class Child extends Parants{
        int b1;
        // 자식 클래스에 만들어지지 않은 변수 a1, a2를
        // 부모 클래스에서 상속받아 사용할 수 있음

        public Child(int a1, int a2, int b1) {
            super(a1, a2);
            this.b1 = b1;
        }
    }
}
