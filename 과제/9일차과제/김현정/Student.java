public class Student {
//    학번을 입력하세요
//    반을 입력하세요
//    이름을 입력하세요
//    나이를 입력하세요
//    연락처를 입력하세요
    private int studentId;
    private int clas;
    private String name;
    private int age;
    private String contact;

    public Student(int studentId, int clas, String name, int age, String contact) {
        this.studentId = studentId;
        this.clas = clas;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return  "(학번 "+studentId+"  " +clas +"반"+ ", 이름: " + name + ", 나이: " + age + ", 연락처 : " + contact + ")";

    }
}
