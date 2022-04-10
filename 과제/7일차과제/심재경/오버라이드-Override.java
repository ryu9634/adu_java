class Women{
    public String name;
    public int age;
    public  void info1(){
        System.out.println( name+"의 나이는 "+age+"입니다.");
    }

}
class Job extends  Women{
    public String job;

    @java.lang.Override     // 부모 클래스에 있는 info 메소드를 재정의
    public void info1() {
        System.out.println("여자의 직업은 "+job+"입니다.");
    }
}


public class Override {
    public static void main(String[] args) {
        Job job =new Job();

        job.name="사만다";
        job.age=27;
        job.job="스튜어디스";

        job.info1(); //출력값 재정의 한 메소드 :여자의 직업은 스튜어디스입니다.



    }
}
