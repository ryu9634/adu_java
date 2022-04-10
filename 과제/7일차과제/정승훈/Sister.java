public class Sister extends Family{     // Sister 클래스는 Family 클래스로부터 메소드와 필드를 물려받아 사용
    String job;

    public Sister(){

    }

    public Sister(int no, String name, int age, String from, String job) {
        super(no, name, age, from);
        this.job = job;
    }

    public String getJob() {return job;}
    public void setJob(String job) {this.job = job;}

    @Override
    public String toString() {
        return super.toString() + "Sister{" +
                "job='" + job + '\'' +
                '}';
    }
}
