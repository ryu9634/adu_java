public class Array6 {
    public static void main(String[] args) {
        int[] num1 = {10, 20, 30, 40, 50};
        for(int i=0; i<num1.length; i++){
            System.out.print(num1[i] + " ");
        }
        System.out.println();

        int[][] num2 = {{10, 20, 30}, {40, 50, 60}};
        for(int i=0; i<num2.length; i++){
            for(int j=0; j<num2[i].length; j++){
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
