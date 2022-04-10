/*
과제.
아래 용어에 대해 조사하고 예제를 만들어보자
 - 상속  *
 - 접근제어자 *
 - super 키워드 *
 - this 키워드 *
 - 생성자  *
 - 오버로딩 *
 - 오버라이딩 *
 */
public class homeWork_1 { //부모클래스
    //인적사항을 적어 내는 프로그램
    private String name;  //이름
    private int age;  //나이
    private String gender; //성별
    private String from;  //출신지

    /* 생성자란
    - new 연산자를 통해 객체를 생성할 때 반드시 호출, 제일 먼저 실행되는 메서드
    - 클래스명과 동일한 이름을 가진 메서드
    - 필드를 초기화하는 역활
    - 반환타입 없음
    - 직접 생성하지 않으면 JVM 이 자동으로 빈 생성자를 만들어 호출
    */
    public homeWork_1() { //이것이 클래스명과 같은 이름을 가진 생성자이다.
    }

    public homeWork_1(String name, int age, String gender, String from) {
        this.name = name;           // this 키워드의 경우 현재 클래스의 변수(필드)를 가리킴
        this.age = age;
        this.gender = gender;
        this.from = from;
    }

    public String getName() {   //보통 클래스의 멤버변수는 private로 접근 제한자를 설정한 후
        return name;            // getter/setter 를 통해 멤버변수의 값을 변경,호출한다.

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    public void print(){
        System.out.println("나는 이런사람입니다.");
    }

    @Override
    public String toString() {
        return "인적사항\n" +
                "이름 : " + name + "\n" +
                "나이 : " + age +
                "\n성별 : " + gender +
                "\n출신 : " + from ;
    }
}
