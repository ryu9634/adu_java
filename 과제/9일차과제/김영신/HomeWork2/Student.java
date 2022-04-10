public class Student {
    private int num;
    private int _class;
    private String name;
    private int age;
    private String phone;

    public Student(int num, int _class, String name, int age, String phone) {
        this.num = num;
        this._class = _class;
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

    public int get_class() {
        return _class;
    }

    public void set_class(int _class) {
        this._class = _class;
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
        return "학번 : " + num + "  " + _class+"반 " + name + "  나이 : " + age
                +"살  번호 : " + phone;
    }
}
