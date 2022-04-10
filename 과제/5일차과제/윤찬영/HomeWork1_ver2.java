public class HomeWork1_ver2 {
    public static void main(String[] args) {
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if(num[i] == num[j])
                i--;
            }
        }
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 6; j++) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        System.out.println("귀하의 행운의 로또번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
