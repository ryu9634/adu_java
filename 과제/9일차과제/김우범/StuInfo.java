public class StuInfo {
    private int no;
    private int cla;
    private String name;
    private int age;
    private String phone;

    public StuInfo(int no, int cla, String name, int age, String phone) {
        this.no = no;
        this.cla = cla;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCla() {
        return cla;
    }

    public void setCla(int cla) {
        this.cla = cla;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "학번: " + no + "반: " + cla + "이름: " + name + "나이: " + age + "연락처: " + phone;
    }
}
