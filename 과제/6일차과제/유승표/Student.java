public class Student {
    private int no;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private int tot;
    private double avg;

    public Student(int no, String name, int kor, int math, int eng) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public Student(int no, String name, int kor, int math, int eng, int tot, double avg) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.tot = tot;
        this.avg = avg;
    }

    public Student(int nextInt) {
    }

    public Student() {

    }

    public int getNo() {
        int no = this.no;
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
        return tot = kor + math + eng;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }


    public double getAvg() {
        return avg = (kor + math + eng) / 3;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
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