public class Inheritance {   //상속하는방법
    public static void main(String[] args) {
        Mom mom= new Mom(45,54,165.5);
        Child child = new Child(10,30,100,"초딩");

        System.out.println("엄마 : "+mom);
        System.out.println("아들 : "+child);
    }
}
class Mom{     //엄마 클래스
    private int age;
    private int weiht;
    private double height;      //변수명 지어주고

    public Mom(int age, int weiht, double height) {         //constructor해주기
        this.age = age;
        this.weiht = weiht;
        this.height = height;
    }

    public int getAge() {
        return age;
    }               //getter setter 만들어주기

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeiht() {
        return weiht;
    }

    public void setWeiht(int weiht) {
        this.weiht = weiht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override                                           //toString만들어주기
    public String toString() {
        return
                "나이=" + age +
                ", 무개=" + weiht +
                ", 키=" + height +
                "";
    }
}


class Child extends Mom{                        //자식클래스 만들어주고 부코클래스 exteds해주기
    String education;                           //주가로 변수

    public Child(int age, int weiht, double height, String education) {     //constructor해주고~
        super(age, weiht, height);
        this.education = education;
    }

    public String getEducation() {                          //getter setter해주고
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override                                                   //toString까지! 추가된게 있으니 super.toString을 사용하기
    public String toString() {
        return super.toString()+" "+ education ;
    }
}

