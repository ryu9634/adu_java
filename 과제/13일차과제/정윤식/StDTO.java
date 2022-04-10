public class StDTO {
    private String st_num;
    private String st_name;
    private String st_phonenum;
    private String st_sex;
    private String rdate;

    public StDTO(String st_num, String st_name, String st_phonenum, String st_sex, String rdate) {
        this.st_num = st_num;
        this.st_name = st_name;
        this.st_phonenum = st_phonenum;
        this.st_sex = st_sex;
        this.rdate = rdate;
    }

    public String getSt_num() {
        return st_num;
    }

    public void setSt_num(String st_num) {
        this.st_num = st_num;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_phonenum() {
        return st_phonenum;
    }

    public void setSt_phonenum(String st_phonenum) {
        this.st_phonenum = st_phonenum;
    }

    public String getSt_sex() {
        return st_sex;
    }

    public void setSt_sex(String st_sex) {
        this.st_sex = st_sex;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    @Override
    public String toString() {
        return "StDTO{" +
                "st_num='" + st_num + '\'' +
                ", st_name='" + st_name + '\'' +
                ", st_phonenum='" + st_phonenum + '\'' +
                ", st_sex='" + st_sex + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}
