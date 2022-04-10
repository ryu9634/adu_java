public class StudentDTO {
    private int st_idx;
    private int st_num;
    private String st_name;
    private String st_hp;
    private String st_gender;
    private String st_regdate;

    public StudentDTO(int st_idx, int st_num, String st_name, String st_hp, String st_gender, String st_regdate) {
        this.st_idx = st_idx;
        this.st_num = st_num;
        this.st_name = st_name;
        this.st_hp = st_hp;
        this.st_gender = st_gender;
        this.st_regdate = st_regdate;
    }

    public int getSt_idx() {return st_idx;}
    public void setSt_idx(int st_idx) {this.st_idx = st_idx;}

    public int getSt_num() {return st_num;}
    public void setSt_num(int st_num) {this.st_num = st_num;}

    public String getSt_name() {return st_name;}
    public void setSt_name(String st_name) {this.st_name = st_name;}

    public String getSt_hp() {return st_hp;}
    public void setSt_hp(String st_hp) {this.st_hp = st_hp;}

    public String getSt_gender() {return st_gender;}
    public void setSt_gender(String st_gender) {this.st_gender = st_gender;}

    public String getSt_regdate() {return st_regdate;}
    public void setSt_regdate(String st_regdate) {this.st_regdate = st_regdate;}

    @Override
    public String toString() {
        return "StudentDTO{" +
                "st_idx=" + st_idx +
                ", st_num=" + st_num +
                ", st_name='" + st_name + '\'' +
                ", st_hp='" + st_hp + '\'' +
                ", st_gender='" + st_gender + '\'' +
                ", st_regdate='" + st_regdate + '\'' +
                '}';
    }
}
