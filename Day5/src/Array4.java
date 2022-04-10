import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int[] arr = new int[num];

        // 80 50 70 100 40
        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번째 숫자를 입력하세요");
            arr[i] = sc.nextInt();
        }

        // 80 50 70 100 40  i=0
        // 40 50 80 100 70  i=1
        // 40 50 70 100 80  i=2
        // 40 50 70 80 100  i=3

        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}
