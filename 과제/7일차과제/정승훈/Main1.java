import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Family[] families = new Family[3];
        families[0] = new Father( 1, "반하나", 50, "수원", "삼성");
        families[1] = new Mother( 2, "오렌지", 48, "수원", 3310);
        families[2] = new Sister( 3, "김사과", 20, "천안", "교사");

        for (int i = 0; i < families.length; i++) {
            System.out.println(families[i]);
        }
    }
}
