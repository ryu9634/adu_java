import java.lang.reflect.Member;

public class HomeworkMember {


    String name;
    String kor;
    String eng;
    String math;
    int tot;
    double avg;

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("총합점수 : " + tot);
        System.out.println("평균점수 : " + avg);
    }
}