public class Homework_Day05_1 {
    public static void main(String[] args) {
        int num = 6;
        int lot[] = new int[num];


        for (int i = 0; i < 6; i++) {
            lot[i] = (int) (Math.random() * 45) + 1; // 임의의 숫자 6개 추출

            for (int j = 0; j < i; j++) {
                if (lot[i] == lot[j]) {
                    i--;
                    break;                          // 중복된 숫자 제거
                }
            }
        }
        System.out.print("로또번호 : ");
        for (int k = 0; k < lot.length - 1; k++) {
            for (int z = k + 1; z < lot.length; z++) {
                if (lot[k] > lot[z]) {
                    int temp = lot[k];
                    lot[k] = lot[z];
                    lot[z] = temp;                  // 오름차순으로 정렬
                }
            }
        }
        for(int i = 0;i<6;i++){
            System.out.print(lot[i]+ " ");          // 출력
        }
    }
}