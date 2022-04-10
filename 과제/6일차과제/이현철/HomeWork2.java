public class HomeWork2 {
    int num;
    String name;
    int kor;
    int math;
    int eng;
    int tot = kor + math + eng;
    int avg = tot / 3;

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
        this.tot = kor+eng+math;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = getAvg();
    }
}


