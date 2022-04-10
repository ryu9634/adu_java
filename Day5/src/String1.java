public class String1 {
    public static void main(String[] args) {
        String str1 = new String("apple");
        String str2 = new String("apple");
        String str3 = "apple";
        String str4 = "apple";

        System.out.println(str1 == str2); // 메모리 주소를 비교, false
        System.out.println(str1.equals(str2)); // 값 비교, true

        System.out.println(str3 == str4);   // 리터럴로 생성된 String은 같은 객체를 참조
        System.out.println(str3.equals(str4));
    }
}
