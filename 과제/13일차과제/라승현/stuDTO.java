public class stuDTO {
    private int stuNum;
    private String name;
    private int phone;
    private String gender;

    public stuDTO(int stuNum, String name, int phone, String gender) {
        this.stuNum = stuNum;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "stuDTO{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                '}';
    }
}
