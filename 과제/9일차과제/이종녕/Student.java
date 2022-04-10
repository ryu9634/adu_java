public class Student {

    private String  num1 ;
    private  String name;
    private  int age;
    private int num2;
    private  String call;

    public Student(String num1, String name, int age, int num2, String call) {
        this.num1 = num1;
        this.name = name;
        this.age = age;
        this.num2 = num2;
        this.call = call;
    }


    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getName() {
        return name;
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

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "[인적사항]" + "{ 학번 : " + num1 + "} { 이름 : "+ name + "} { 나이 : "+ age +
        " } { 반 : "+num2+ " } { 연락처 : " + call + " } ";
    }
}
