interface Compare {
    public int compareTo(int a, int b);
}

public class Lambda2 {
    public static void exec(Compare com){
        int num1 = 10;
        int num2 = 20;
        int result = com.compareTo(num1, num2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i + j;
        });
        exec((i, j) -> {
            return i * j;
        });
    }
}
