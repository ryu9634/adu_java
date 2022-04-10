public class Homework1 {
    public static void main(String[] args) {
        int lot[] = new int[6];

        for(int i = 0; i < lot.length; i++){
            lot[i] = (int)(Math.random() * 45) + 1;
        }
        System.out.print("로또번호 : ");    //랜덤번호 6개 생성

        int num = 0;
        for(int i = 0; i < lot.length-1; i++){
            for (int j = i+1; j < lot.length; j++) {
                if (lot[i] == lot[j]){     //lot i와 i+1을 비교해서 같으면 i+1번째에 랜덤수 다시 생성
                    lot[j] = (int)(Math.random() * 45) + 1;
                }
                if (lot[i] > lot[j]) {
                    num = lot[i];
                    lot[i] = lot[j];
                    lot[j] = num;
                }
            }
        }
        for (int i = 0; i < lot.length; i++){
            System.out.print(lot[i] + " ");
        }
    }
}
