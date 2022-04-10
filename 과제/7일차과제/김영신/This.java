/*
    this 키워드란?
    - 객체 ( 인스턴스 ) 즉 자기 자신을 뜻한다.
 */
class Example {
    private int a = 1;

    int toOne(int a){
       a = this.a;
       return a;
    }
}

public class This {
    public static void main(String[] args) {
        int a = 0;
        Example example = new Example();
        a = example.toOne(a);
        System.out.println(a);
    }
}
