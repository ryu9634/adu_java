public class HomeWork_lotto {
    public static void main(String[] args) {
        System.out.println("로또 번호를 출력합니다.");
        int num = 6;
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            double random = Math.random();
            arr[i] = (int) (random * 45) + 1;              // 1 ~ 45까지 무작위 숫자 6개 추출
            for (int j = 0; j < i; j++){
                if(arr[i] == arr[j]){                       // 배열 i의 숫자가 j와 겹치는게 있는지 확인
                    i--;                                    // 겹치면 i의 숫자 제거
                    break;
                }
            }
                System.out.print(arr[i] + " ");             // 1 ~ 45 무작위 숫자 6개 중복 없이 출력 확인
        }

        System.out.println();

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

