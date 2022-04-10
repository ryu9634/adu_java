public class Student {
    private String studentNum;
    private String classNum;
    private String name;
    private String age;
    private String callNum;

    public Student(String studentNum, String classNum, String name, String age, String callNum) {
        this.studentNum = studentNum;
        this.classNum = classNum;
        this.name = name;
        this.age = age;
        this.callNum = callNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCallNum() {
        return callNum;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }

    @Override
    public String toString() {
        return  "학번 : "+studentNum + ", 반 : " + classNum + ", 이름 : " + name + ", 나이 : " + age + ", 연락처 : " + callNum;
    }
}
