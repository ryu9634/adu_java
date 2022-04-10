import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String str1 = new String("Java");
        System.out.println(str1);
        String str2 = "Programming";
        System.out.println(str2);

        // concat() : 문자열과 문자열을 연결
        System.out.println(str1.concat(str2));

        // indexOf : 원하는 문자(열)을 찾아 해당하는 문자의 index를 리턴
        System.out.println(str2.indexOf("p")); // -1, 찾지 못함
        System.out.println(str2.indexOf("P"));  // 0
        System.out.println(str2.indexOf('P'));  // 0
        System.out.println(str2.indexOf("gra")); // 3, 문자열의 시작인덱스

        // trim() : 문자열의 앞뒤 공백을 제거
        String str3 = new String("     자바     ");
        System.out.println(str3 + "😜");
        System.out.println(str3.trim() + "😜");

        // toLowerCase(), toUpperCase() : 문자를 소문자, 대문자로 변환
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        // length() : 문자열의 길이를 반환
        System.out.println(str2.length());

        // substring() : 원하는 문자열을 추출
        System.out.println(str2.substring(3)); // 문자열의 index 3부터 끝까지 추출
        System.out.println(str2.substring(3, 6)); // 문자열의 index 3부터 6이 되기 전까지 추출

        // 문자열을 숫자로 변환
        String str4 = "100";
        int i = 200;
        int result = Integer.parseInt(str4) + i;    // String -> int
        System.out.println(result);
    }
}
