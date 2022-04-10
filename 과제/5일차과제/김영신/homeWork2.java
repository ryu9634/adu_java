import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; int multi; int lastNum; int fakeNum_noExis = 0;

        while(fakeNum_noExis == 0) {

            System.out.println("주민등록번호를 입력하세요 (띄어쓰기 부탁드립니다)");

            String privNum1 = sc.next();
            String privNum2 = sc.next();
            String privNum = privNum1.concat(privNum2);
            if (privNum.length() != 13) {
                System.out.println("다시 입력하세요.");
                continue;
            }
            else fakeNum_noExis++;

            for (int i = 0; i < privNum.length() - 1; i++) {
                multi = i % 8 + 2;
                sum += Integer.parseInt(privNum.substring(i, i + 1)) * multi;
            }

            lastNum = 11 - (sum % 11);
            if (lastNum >= 10)
                lastNum %= 10;
            if (lastNum == Integer.parseInt(privNum.substring(privNum.length() - 1)))
                System.out.println("유효한 주민등록번호 입니다.");
            else
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
