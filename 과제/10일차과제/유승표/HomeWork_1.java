public class HomeWork_1 {
    //생성자를 만들어서 결과값이 출력되게끔 만들어줌
    private String name;
    private String kor;
    private String eng;
    private String math;
    private int tot;
    private int avg;
    private String rank;

    public HomeWork_1(String name, String kor, String eng, String math, int tot, int avg, String rank) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.tot = tot;
        this.avg = avg;
        this.rank = rank;

    }

    public HomeWork_1(String name, String kor, String eng, String math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.tot = getTot();
        this.avg = getAvg();
        this.rank = getRank();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public int getTot() {
        tot = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int getAvg() {
        avg = tot / 3;
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public String getRank() {
        if (avg >= 90) rank = "A";
        else if (avg >= 80) rank = "B";
        else if (avg >= 70) rank = "C";
        else if (avg >= 60) rank = "D";
        else rank = "F";
        return rank;
    }

    public void setRank(String rank) {

        this.rank = rank;
    }

    @Override
    public String toString() {
        return
                "이름 : " + name + "\n" +
                        "국어점수 : " + kor + "\n" +
                        "영어점수 : " + eng + "\n" +
                        "수학점수 : " + math + "\n" +
                        "총점 : " + tot + "\n" +
                        "평균 : " + avg + "\n" +
                        "학점 : " + rank
                        + "\n";
    }
}
