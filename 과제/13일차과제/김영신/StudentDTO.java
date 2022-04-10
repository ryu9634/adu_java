public class StudentDTO {
    private String num;
    private String name;
    private String hp;
    private String gender;

    public StudentDTO(String num, String name, String hp, String gender) {
        this.num = num;
        this.name = name;
        this.hp = hp;
        this.gender = gender;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
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

    @Override
    public String toString() {
        return "StudentDTO{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
