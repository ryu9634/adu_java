public class While5 {
    public static void main(String[] args) {
        int i = 2;
        int j = 1;
        while(i <= 9){
            System.out.println(i + "단");
            while(j <= 9){
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            i++;
            j = 1;
        }
    }
}
