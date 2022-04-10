public class StudentDTO {
    private String num;
    private String name;
    private String ph;
    private String sex;
    private String rdate;

    public StudentDTO(String num, String name, String ph, String sex, String rdate) {
        this.num = num;
        this.name = name;
        this.ph = ph;
        this.sex = sex;
        this.rdate = rdate;
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

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", sex='" + sex + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}
