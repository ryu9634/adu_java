public class Homework1 {
    public static void main(String[] args) {
        int[] num = new int[6];
        int temp = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                }
            }

            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("로또 예상번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + "," + " ");
        }
    }
}
