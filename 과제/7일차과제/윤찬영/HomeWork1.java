import java.util.Scanner;

// 과제) 상속, super, this, 생성자, 오버로딩, 오버라이딩
public class HomeWork1 {
    public static void main(String[] args) {
        HomeWork1_Child[] homeWork1 = new HomeWork1_Child[2];

        homeWork1[0] = new HomeWork1_Child("리니지W", 19, "lineage.mp3");
        homeWork1[1] = new HomeWork1_Child("메이플", 20, "mapleStory.mp3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("메뉴를 선택하시오(1.설치 게임 확인 2. 게임 실행 3.컴퓨터종료) >>> ");
            int cho = sc.nextInt();
            if (cho == 3) {
                System.out.println("컴퓨터를 종료합니다.");
                break;
            }
            switch (cho) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        System.out.println(homeWork1[i].toString());
                    }
                    break;

                case 2:
                    System.out.print("어느게임을 실행하시겠습니까?(1.리니지  2.메이플) >>> ");
                    int game = sc.nextInt();
                    homeWork1[game].powerOn();
                    System.out.println("");

                    while (true) {
                        System.out.print("메뉴를 선택해주세요.(1.회원가입  2.종료)");
                        int menu = sc.nextInt();
                        if (menu == 2) {
                            homeWork1[game].powerOff();
                            break;
                        }
                        switch (menu) {
                            case 1:
                                System.out.print("원하시는 id(문자)와 비밀번호(숫자)를 입력하세요 >>> ");
                                homeWork1[game].security(sc.next(), sc.nextInt());
                                System.out.print("2차 비밀번호(숫자)를 입력하세요 >>> ");
                                homeWork1[game].security(sc.nextInt());
                                System.out.println("회원가입 완료되었습니다.");
                                break;

                            default:
                                System.out.println("입력값을 확인하세요.");

                        }
                    }
            }
        }
    }
}

