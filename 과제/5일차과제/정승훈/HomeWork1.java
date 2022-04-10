//1. 로또번호 예측 프로그램을 만들어보자.
//        - 오름차순
//        - 중복된 숫자 제거
//          1 ~ 45

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int)(Math.random() * 45)+1;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("로또번호는 : " + arr[i]);
        }
    }
}
