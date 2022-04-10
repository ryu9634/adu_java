public class Family {

    int no;
    String name;
    int age;
    String from;

    public Family(){        // 기본생성자 : new 연산자를 통해서 인스턴스를 생성할 때 반드시 호출이 되고 제일 먼저 실행된다

    }

    public Family(int no, String name, int age, String from) {      // 매개변수를 가진 생성자
                                                                    // 인스턴스 변수(필드 값 등)를 초기화 시키는 역할을 한다.
        this.no = no;       // 매개 변수가 있는 생성자를 참조하여 메인 클래스에서 생성자를 호출할 때 해당 값이 자동으로 대입
        this.name = name;
        this.age = age;
        this.from = from;
    }

    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getFrom() {return from;}
    public void setFrom(String from) {this.from = from;}

    @Override                   // toString의 Overring
    public String toString() {  // 기존의 최상위 클래스 메서드인 toString을 재정의하여 새로운 값을 넣음
        return "Family{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", from='" + from + '\'' +
                '}';
    }
}
