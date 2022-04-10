public class StudentDTO {
    private int idx;
    private String name;
    private String hp;
    private String gd;
    private String rdate;

    public StudentDTO(int idx, String name, String hp, String gd, String rdate) {
        this.idx = idx;
        this.name = name;
        this.hp = hp;
        this.gd = gd;
        this.rdate = rdate;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
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

    public String getGd() {
        return gd;
    }

    public void setGd(String gd) {
        this.gd = gd;
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
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                ", gd='" + gd + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}

