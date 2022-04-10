public class Student {
    private int no; // 학생번호
    private String name;
    private int kor; // 국어점수
    private int eng; // 영어점수
    private int math; // 수학점수

    public int getNo() {
        return no;
    }

    public int setNo(int no) {
        this.no = no;
        return no;
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

    public void info(){
        System.out.println(no + ", " + name + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAvg());
    }

    public int getTotal(){ // 총점
        return kor + eng + math;
    }

    public double getAvg(){ // 평균
        return (kor + eng + math) / 3.0;
    }
}