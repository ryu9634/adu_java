public class Student {

    private String stnum;
    private int stclass;
    private String name;
    private int age;
    private String phonenum;

    public String getStnum() {
        return stnum;
    }

    public void setStnum(String stnum) {
        this.stnum = stnum;
    }

    public int getStclass() {
        return stclass;
    }

    public void setStclass(int stclass) {
        this.stclass = stclass;
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

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Student(String stnum, int stclass, String name, int age, String phonenum) {
        this.stnum = stnum;
        this.stclass = stclass;
        this.name = name;
        this.age = age;
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return name + ":" + "  학번 : "+ stnum +"  " +stclass +"반  "+ age +"세  "+" 전화번호: " + phonenum ;
    }
}
