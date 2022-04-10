public class Student {
    private int no;
    private int classno;
    private String name;
    private int age;
    private String phone;

    public Student() {
    }

    public Student(int no, int classno, String name, int age, String phone) {
        this.no = no;
        this.classno = classno;
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

    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
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
        return "▷이름 : " + name +
                ", 학번 : " + no +
                ", 반 : '" + classno + '\'' +
                ", 나이 : " + age +
                ", 연락처 : '" + phone + '\'';
    }
}
