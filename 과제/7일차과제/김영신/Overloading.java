import java.io.PrintStream;

/*
    오버로딩(Overloading) 이란?
    - 메서드명이 같고 시그니처가 같은 메서드를 만드는 것
    - 대표적으로 PrintStream의 메서드 print, println이 이에 해당한다.
    - (System.out instanceof PrintStream) == true;
 */
class Ol{
    public void print(){
        System.out.println("기본 print");
    }
    void print(int a){
        System.out.println("int타입 print");
    }
    String print(String a){
        return "String타입 print";
    }
}
public class Overloading {
    public static void main(String[] args) {
    Ol ol = new Ol();
    ol.print();
    ol.print(1);
        System.out.println(ol.print("String 타입 메서드 호출"));
        /*
            기본 print
            int 타입 print
            String 타입 print
         */
    }

}
