public class StudentInfo {

    private int num;
    private String classroom;
    private String name;
    private int age;
    private int phone;

    public StudentInfo(int num, String classroom, String name, int age, int phone) {
        this.num = num;
        this.classroom = classroom;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
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
        return "학생정보{" +
                "학번 : " + num +
                ", 학급 : '" + classroom + '\'' +
                ", 이름 : '" + name + '\'' +
                ", 나이 : " + age +
                ", 연락처 : " + phone +
                '}';
    }
}

