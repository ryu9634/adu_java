public class Child extends Parent{

    String b1="자식클래스 필드";
    int b2;
    int b3;
    String b4;

    // 생성자(Constructor)란? : 클래스의 필드를 초기화 함

    public Child(){

    }
    // 오버로딩: 생성자의 메소드명이 같으나, 시그니쳐가 다른
                //  생성자 메소드를 여러개 생성하는것

    public Child(String b1, int b2, String b4) {
        this.b1=b1;
        this.b2=b2;
        this.b3=b2+3;
        this.b4=b4;
        System.out.println("생성자가 호출되었습니다.");
    }

    public Child(String b1) {
        this(b1, 0, "무명");
        System.out.println("오버로딩 생성자가 호출되었습니다.");

    }

    // Parent의 to.String 을 super 키워드로 가져옴
    // 오버라이딩: 부모 클래스에 이미 존재하는 메소드를 자식 클래스에서
    //          재정립하여 사용하는것

    @Override
    public String toString() {
        return super.toString()+ "{" +
                "b1='" + b1 + '\'' +
                ", b2=" + b2 +
                ", b3=" + b3 +
                ", b4='" + b4 + '\'' +
                '}';
    }


    // this 키워드: 해당 클래스의 필드를 가져올때 메소드의 파라미터와 헷갈리지 않도록 표시함

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB1() {
        return b1;
    }





}

