public class Day6Homework1Student {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private int avg;

    public Day6Homework1Student(){
    }

    public Day6Homework1Student(int num,String name, int kor, int eng, int math){
        this.num = num;
        this.name =name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.tot = kor + eng + math;
        this.avg = (kor + eng + math) / 3;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
        return num + "학생{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", tot=" + tot +
                ", avg=" + avg +
                '}';
    }
}
