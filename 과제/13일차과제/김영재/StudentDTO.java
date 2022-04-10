public class StudentDTO {
    private int stnum ;
    private String name;
    private String pnum;
    private String gender;
    private String rdate;

    public StudentDTO(int stnum, String name, String pnum, String gender, String rdate) {
        this.stnum = stnum;
        this.name = name;
        this.pnum = pnum;
        this.gender = gender;
        this.rdate = rdate;
    }

    public int getStnum() {
        return stnum;
    }

    public void setStnum(int stnum) {
        this.stnum = stnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
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
                "stnum=" + stnum +
                ", name='" + name + '\'' +
                ", pnum='" + pnum + '\'' +
                ", gender='" + gender + '\'' +
                ", rdate='" + rdate + '\'' +
                '}';
    }
}
