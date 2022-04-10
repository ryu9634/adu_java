import java.util.Scanner;

public class HomeWork2 {


    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("주민등록번호 유효성검사");
        System.out.println("------------------");
        System.out.println();

        while (true) {
            //주민등록번호를 입력받는다
            Scanner sc = new Scanner(System.in);

            System.out.print("주민등록번호를 입력해주세요");
            System.out.println("  (가운데 - 는 제외합니다)");
            String ssnum = sc.next();
            if (ssnum.length() != 13) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
                continue;
            }
            //유효성 검사하기 주민번호
            int tot = 0;
            int check[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
            int result = 0;
            if (ssnum.length() == 13) {
                for (int i = 0; i < ssnum.length() - 1; i++) {

                    tot += check[i] * Integer.parseInt(ssnum.substring(i, i + 1));

                }
            }
            result = 11 - (tot % 11);
            if (result >= 10) {
                result = result % 10;
            }
            if (result == Integer.parseInt(ssnum.substring(12))) {
                System.out.println("주민번호는 정상입니다");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력하세요");
            }

        }

    }
}
