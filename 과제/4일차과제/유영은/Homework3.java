public class Homework3 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("로또번호 : ");
        while (i <= 6) {
            int r = (int) (Math.random() * 45) + 1;
                System.out.print(r + " ");
            i++;
        }
    }
}
