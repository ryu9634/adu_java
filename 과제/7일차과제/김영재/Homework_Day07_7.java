class Myclass{
    public String a = "안녕";
    public String b = "그래";

    private String c = "안돼" ;

    String d = "나도";

    protected String e = "오냐";
    }



public class Homework_Day07_7 extends Myclass {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        System.out.println(m.a); // public
       // System.out.println(m.c); //접근 안됨
        System.out.println(m.d); // default
        System.out.println(m.e); // Protected : 상속받은 자식클래스꺼 불러와도 가능
    }

}


