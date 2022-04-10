public class Lambda1 {
    public static void main(String[] args) {
        Calc minNum = (x, y) -> x < y ? x : y;

        System.out.println(minNum.min(5, 3));
    }
}
