import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member = 5;
        int[] arr = new int[member];

        // 배열명.length : 배열의 요소 길이를 반환
        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번째 숫자를 입력하세요");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
