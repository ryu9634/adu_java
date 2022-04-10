import java.util.Random;

/*
과제3.
로또 예측 프로그램을 만들어보자.
(단, 1~45 숫자 6개를 추출, 중복된 숫자가 없어야 함)
이중for문을 사용
*/
public class homeWork3 {
    public static void main(String[] args) {
        int count;
        int i1 = (int) (Math.random() * 45) + 1;
        int i2 = (int) (Math.random() * 45) + 1;
        int i3 = (int) (Math.random() * 45) + 1;
        int i4 = (int) (Math.random() * 45) + 1;
        int i5 = (int) (Math.random() * 45) + 1;
        int i6 = (int) (Math.random() * 45) + 1;

        for (count = 1; count <= 1; count++) {
            while (true) {
                if (       i1 == i2 || i1 == i3 || i1 == i4 || i1 == i5 || i5 == i6
                        || i1 == i6 || i2 == i3 || i2 == i4 || i2 == i5 || i2 == i6
                        || i3 == i4 || i3 == i5 || i3 == i6 || i4 == i5 || i4 == i6) {
                    System.out.println("중복숫자입니다. 다시 시도해주세요!");
                } else {
                    System.out.println("1번 번호 : " + i1);
                    System.out.println("2번 번호 : " + i2);
                    System.out.println("3번 번호 : " + i3);
                    System.out.println("4번 번호 : " + i4);
                    System.out.println("5번 번호 : " + i5);
                    System.out.println("6번 번호 : " + i6);
                    break;
                }break;
            }
        }
    }
}
