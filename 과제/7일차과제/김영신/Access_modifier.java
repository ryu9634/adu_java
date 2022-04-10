/*
    접근제어자란?
    내부데이터가 외부에 공개되는 수준을 의미한다.
    변수와 메서드의 접근제어자는
    public, protected, default, private이 있으며
    객체지향적 프로그래밍에 따라 크게 public 과 private을 쓴다.

    - public : 모든 외부에서 직접 접근하거나 호출이 가능하다
    - protected : 현재 클래스와 동일한 패키지 혹은 다른 패키지라도 상속관계에 있는 경우 접근이 가능하다
    - default : 현재 클래스와 동일한 패키지 내에서만 접근하거나 호출이 가능하다
    (접근제어자를 생략하면 자바 컴파일러는 default로 인식한다.)
    - private : 현재 클래스내에서만 접근이 가능하다.

    class의 접근제어자는 public과 default가 있다.
 */
class Acc_M{
    public int pub = 1;
    protected int pro = 1;
    int def = 1;
    private int pri = 1;
}
public class Access_modifier {
    public static void main(String[] args) {
        Acc_M acc = new Acc_M();
        System.out.println(acc.pub);
        System.out.println(acc.pro);
        System.out.println(acc.def);
//        System.out.println(acc.pri); Acc_M 클래스를 벗어났으므로 접근이 불가능하다
    }  
    
}
