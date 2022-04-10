import java.util.Scanner;

public class Oop6 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Apple("사과", 1000, "빨강", "청송", 7);
        fruits[1] = new Banana("바나나", 2000, "노랑", "필리핀", 10);
        fruits[2] = new Orange("오렌지", 1200, "오렌지색", "호주", 0.5);

//        for(Fruit f : fruits){
//            System.out.println(f);
//        }

        Scanner sc = new Scanner(System.in);
        Fruit[] order = new Fruit[10];  // 구입한 과일 목록을 저장할 배열

        int sel;     // 선택한 메뉴 번호
        int cnt = 0; // 과일 구입 개수

        while(true){
            System.out.println("메뉴를 선택하세요(1.사과구입 2.바나나구입 3.오렌지구입 4.구입목록 5.과일검색 6.종료)");
            sel = sc.nextInt();
            if(sel == 6) break;
            switch (sel) {
                case 1:
                case 2:
                case 3:
                    order[cnt++] = fruits[sel-1];
                    /*
                        fruits[0] : apple  1
                        fruits[1] : banana 2
                        fruits[2] : orange 3
                     */
                    System.out.println(fruits[sel-1].getName() + "가 담겼습니다.");
                    break;
                case 4:
                    System.out.println("❤❤❤❤❤❤❤❤❤❤ 구입한 과일 ❤❤❤❤❤❤❤❤❤❤");
                    for(int i=0; i<cnt; i++){
                        System.out.println((i+1) + " : " + order[i]);
                    }
                    System.out.println("❤❤❤❤❤❤❤❤❤❤ 구입한 과일 ❤❤❤❤❤❤❤❤❤❤");
                    break;
                case 5:
                    System.out.println("검색할 과일을 선택하세요(1.사과 2.바나나 3.오렌지)");
                    int choice = sc.nextInt();
                    for(int i=0; i<fruits.length; i++){
                        boolean b1 = (choice == 1 && fruits[i] instanceof Apple);
                        boolean b2 = (choice == 2 && fruits[i] instanceof Banana);
                        boolean b3 = (choice == 3 && fruits[i] instanceof Orange);
                        if(b1 || b2 || b3){
                            System.out.println((i+1) + " : " + fruits[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("입력을 확인하세요!");
            }
        }
    }
}
