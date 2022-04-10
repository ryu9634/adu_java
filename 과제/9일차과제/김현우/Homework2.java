public class Homework2 {
    int Num;
    String Classnum;
    String Name;
    int Old;
    String Phonenum;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public String getClassnum() {
        return Classnum;
    }

    public void setClassnum(String classnum) {
        Classnum = classnum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getOld() {
        return Old;
    }

    public void setOld(int old) {
        Old = old;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String phonenum) {
        Phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "학생정보{" +
                "학번: " + Num +
                ", 반: " + Classnum + '\'' +
                ", 이름: " + Name + '\'' +
                ", 나이: " + Old +
                ", 연락처: " + Phonenum + '\'' +
                '}';
    }

    public Homework2(int num, String classnum, String name, int old) {
        Num = num;
        Classnum = classnum;
        Name = name;
        Old = old;
        Phonenum = Phonenum;

    }
}
