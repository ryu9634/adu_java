//아래의 public 의 경우 클래스의 접근제한자이고 다른패키지, 상속관계가 아닌 클래스여도 접근이 가능하다.
//접근 제한자의 종류로는 public, protected, default, private 가 있으며 각각 접근할수 있는 범위가 다르다.
public class homeWork_2 extends homeWork_1 { //자식 클래스 : homeWork_1 을 상속 받는다.

    //오버 라이딩은 상속관계에서 부모의 메소드를 재정의해서  자식클래스에 맞게 사용하는 것입니다
    /*
    public void print(){
        System.out.println("나는 이런사람입니다.");
    }           이런 메소드를 아래와 같이 바꿔보았다.
     */
    @Override
    public void print() {
        System.out.println("나는 이런사람이 아닙니다.");
    }

    public homeWork_2(String name, int age, String gender, String from) {
        super(name, age, gender, from);  //super 키워드의 경우 부모클래스(상위클래스)의 변수를 가르킴



    }

}
