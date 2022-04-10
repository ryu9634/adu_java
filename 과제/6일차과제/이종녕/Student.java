public class Student {
    private  int no;
    private  String name;
    private  int kor;
    private  int eng;
    private  int math;
    private int total;
    private  double avg;

    public Student(int no, String name, int kor, int eng, int math, int total, double avg) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.avg = avg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

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

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "학생정보{" +
                " 번호 = " + no +
                " 이름 = " + name +" } {"+
                "국어점수 = " + kor +
                " 영어점수 = " + eng +
                " 수학점수 = " + math +
                " 총합 =" + total +
                " 평균점수 = " + avg +
                '}';
    }
}
