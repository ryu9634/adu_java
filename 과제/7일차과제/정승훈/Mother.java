public class Mother extends Family{     // Mother 클래스는 Family 클래스로부터 메소드와 필드를 물려받아 사용
    int carNum;

    public Mother(){                       // Overloading
                                           // 1개의 클래스에서 동일한 이름의 메소드 또는
                                           // 생성자를 여러개 정의하는 것
    }                                      //동일한 기능의 메서드를 정의할 때 외부로부터 다양한 입력값(매개값)을 받기 위해서 사용
    public Mother(int no, String name, int age, String from, int carNum) {
        super(no, name, age, from);
        this.carNum = carNum;
    }

    public int getNum() {return carNum;}
    public void setNum(int num) {this.carNum = num;}

    @Override
    public String toString() {
        return super.toString() + "Mother{" +
                "carNum=" + carNum +
                '}';
    }
}
