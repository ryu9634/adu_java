public class StudentDTO {
    private int idx;
    private String num;
    private String name;
    private String hp;
    private String gender;
    private String wdate;

    public StudentDTO(int idx, String num, String name, String hp, String gender, String wdate) {
        this.idx = idx;
        this.num = num;
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        this.wdate = wdate;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWdate() {
        return wdate;
    }

    public void setWdate(String wdate) {
        this.wdate = wdate;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "idx=" + idx +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", gender='" + gender + '\'' +
                ", wdate='" + wdate + '\'' +
                '}';
    }
}
