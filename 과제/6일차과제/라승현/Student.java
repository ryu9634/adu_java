public class Student {
    private int num;                                        // 몇명인지 확인
    private int no;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private int tot;
    private int avg;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
            this.avg = avg;
        }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", math=" + math +
                ", eng=" + eng +
                ", tot=" + tot +
                ", avg=" + avg +
                '}';
    }

    public Student(int num, int no, String name, int kor, int math, int eng, int tot, int avg) {
        this.num = num;
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.tot = tot;
        this.avg = avg;
    }
}

