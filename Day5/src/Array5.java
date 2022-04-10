public class Array5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        for(int i=0; i<arr.length; i++){
            System.out.println("🎁 현재 i의 값 : " + i);
            for(int j=0; j<arr[i].length; j++){
                System.out.println("👍 현재 j의 값 : " + j);
                arr[i][j] = 10;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
