public class Student {
    private String num;
    private int ban;
    private String name;
    private int age;
    private String phoneNum;

    public Student(String num, int ban, String name, int age, String phoneNum) {
        this.num = num;
        this.ban = ban;
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return num +" "+
                ban + "반" +
                ", 이름 : '" + name + '\'' +
                ", 나이 : " + age +
                ", 핸드폰번호 :'" + phoneNum + '\''
                ;
    }
}

