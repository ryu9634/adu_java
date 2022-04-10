public class Homework2 {

    private int no;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private int tot;
    private double avg;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        tot=kor+math+eng;
        avg=tot/3.0;
        return "Homework2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", math=" + math +
                ", eng=" + eng +
                ", tot=" + tot +
                ", avg=" + avg +
                '}';
    }
}
