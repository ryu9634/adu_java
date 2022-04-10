// 학번, 반, 이름, 나이, 연락처 저장

public class AdminOrd {
    private int stunum;
    private int clasnum;
    private String name;
    private int age;
    private int phone;

    public AdminOrd(int stunum, int clasnum, String name, int age, int phone) {
        this.stunum = stunum;
        this.clasnum = clasnum;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    public int getClasnum() {
        return clasnum;
    }

    public void setClasnum(int clasnum) {
        this.clasnum = clasnum;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "학생 정보" + " {" + "학번 : " + stunum + ", 이름 : " + name + " (반 : " + clasnum + "반, 나이 : " + age + "살, 휴대폰 번호 : " + phone + ")} ";
    }
}
