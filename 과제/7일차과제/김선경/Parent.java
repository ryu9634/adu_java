import javax.swing.*;

public class Parent {
    // super 키워드: 부모 속성의 필드, 메소드를 자식 클래스에 넘겨줄때 사용

String a1="부모속성";
String a2="필드";

    @Override
    public String toString() {
        return "Parent{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }
}
