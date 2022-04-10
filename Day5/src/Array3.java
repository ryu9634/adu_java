import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int[] arr = new int[num];

        // 70 90 100 60 80
        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번째 숫자를 입력하세요");
            arr[i] = sc.nextInt();
            /*
                arr[0] = 70;
                arr[1] = 90;
                arr[2] = 100;
                arr[3] = 60;
                arr[4] = 80;
             */
        }

        int max = arr[0];   // 70, 현재 최대값 -> 90 -> 100
        int min = arr[0];   // 70, 현재 최소값 -> 60

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
