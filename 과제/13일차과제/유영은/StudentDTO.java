public class StudentDTO {
    private int std_num;
    private String std_name;
    private String std_hp;
    private String gender;

    public StudentDTO(int std_num, String std_name, String std_hp, String gender) {
        this.std_num = std_num;
        this.std_name = std_name;
        this.std_hp = std_hp;
        this.gender = gender;
    }

    public int getStd_num() {
        return std_num;
    }

    public void setStd_num(int std_num) {
        this.std_num = std_num;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_hp() {
        return std_hp;
    }

    public void setStd_hp(String std_hp) {
        this.std_hp = std_hp;
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
                "std_num=" + std_num +
                ", std_name='" + std_name + '\'' +
                ", std_hp='" + std_hp + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
