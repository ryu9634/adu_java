public class studentDTO {
    private int idx;
    private int num;
    private String name;
    private int hp;
    private String gender;
    private String rdate;

    public studentDTO(int idx, int num, String name, int hp, String gender, String rdate) {
        this.idx = idx;
        this.num = num;
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        this.rdate = rdate;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
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
        return "studentDTO{" +
                "idx=" + idx +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", gender='" + gender + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}
