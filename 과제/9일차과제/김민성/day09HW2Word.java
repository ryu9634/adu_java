public class day09HW2Word {
    private String classNumber;
    private String group;
    private String age;
    private String name;
    private int phoneNumber;

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "day09Word{" +
                "classNumber='" + classNumber + '\'' +
                ", group='" + group + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public day09HW2Word(String classNumber, String group, String age , String name, int phoneNumber) {
        this.classNumber = classNumber;
        this.group = group;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}





