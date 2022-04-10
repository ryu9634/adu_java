public class StudentDTO {
    private int num;
    private String name;
    private String hp;
    private String gender;
    private String rdate;

    public StudentDTO(int num, String name, String hp, String gender, String rdate) {
        this.num = num;
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        this.rdate = rdate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", gender='" + gender + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}
