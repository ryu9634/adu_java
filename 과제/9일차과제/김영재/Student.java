public class Student {
    private int stno;
    private int ban;
    private String name;
    private int age;
    private String phone;

    public Student(int stno, int ban, String name, int age, String phone) {
        this.stno = stno;
        this.ban = ban;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getStno() {
        return stno;
    }

    public void setStno(int stno) {
        this.stno = stno;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "학번 : " + stno +
                "\n반 : " + ban + "반" +
                "\n이름 : " + name +
                "\n나이 : " + age + "살"+
                "\n연락처 : " + phone;
    }
}
