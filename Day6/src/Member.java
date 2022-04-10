public class Member {
    private String userid;
    private String password;
    private String name;
    private String email;
    private String gender;

    public Member(){
        System.out.println("Member 객체가 만들어졌어요");
    }

    public Member(String userid, String password){
        this(userid, password, "무명", "모름", "모름");
    }

    public Member(String userid, String password, String name, String email, String gender) {
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void info(){
        System.out.println("아이디 : " + userid);
        System.out.println("비밀번호 : " + password);
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("성별 : " + gender);
    }
}
