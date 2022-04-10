public class This {
    String color ;
    String gearType;
    int door;

    This(){
        this("white","auto",4);
        // // This()  호출

    }
    This(String color){
        this(color,"auto",4);
        //This(color) 호출
    }


    public This(String color, String gearType, int door) {
        this.color = color;   // 생성자의 매개 변수로 선언된 변수의 이름이
        // 인스턴스 변수와 같을때 인스턴스 변수와 지역변수를 구분하기 위해 사용.
        //this.color은 인스턴스 변수 , color은 매개변수로 정의된 지역변수
        this.gearType = gearType;
        this.door = door;
    }
}
