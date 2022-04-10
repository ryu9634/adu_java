import java.util.SortedMap;

public class Oop3 {
    public static void main(String[] args) {
        Person apple = new Person();
        System.out.println(apple.getName());    // String -> null
        System.out.println(apple.getAge());     // int -> 0
        System.out.println(apple.getHeight());  // double -> 0.0
        System.out.println(apple.isLover());    // boolean -> false
        apple.info();

    }
}
