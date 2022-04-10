public class Homework1 {
    private int num;
    private int no;
    private String name;
    private int age;
    private int contact;

    public Homework1(int num, int no, String name, int age, int contact) {
        this.num = num;
        this.no = no;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Homework1{" +
                "num=" + num +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                '}';
    }
}
