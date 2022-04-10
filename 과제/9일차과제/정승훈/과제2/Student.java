public class Student {
    private int num;
    private int ban;
    private String name;
    private int age;
    private String phone;

    public Student(int num, int ban, String name, int age, String phone) {
        this.num = num;
        this.ban = ban;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getNum() {return num;}
    public void setNum(int num) {this.num = num;}

    public int getBan() {return ban;}
    public void setBan(int ban) {this.ban = ban;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    @Override
    public String toString() {
        return "{" +
                "학번 =" + num +
                ", 반 =" + ban +
                ", 이름 ='" + name + '\'' +
                ", 나이 =" + age +
                ", 전화번호 ='" + phone + '\'' +
                '}';
    }
}
