public class StudentDTO {
    private int idx;
    private String num;
    private String name;
    private String hp;
    private String gender;
    private String regdate;

    public StudentDTO(int idx, String num, String name, String hp, String gender, String regdate) {
        this.idx = idx;
        this.num = num;
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        this.regdate = regdate;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
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

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "idx=" + idx +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", gender='" + gender + '\'' +
                ", regdate='" + regdate + '\'' +
                '}';
    }
}
