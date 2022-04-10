import java.util.Scanner;

/*
과제. (가위,바위,보 게임)



결과
가위,바위,보중 하나를 선택하세요
가위
컴퓨터: 보
유저 : 가위
이겼습니다!


 */
public class HomeWork {
    public static void main(String[] args) {
        System.out.println("결과");
        Scanner sc = new Scanner(System.in);
        System.out.println("가위,바위,보 중 하나를 선택해주세요 ");
        System.out.println("1=가위,2=바위,3=보");
        int user = sc.nextInt();

        double random = Math.random();
        int cpu = (int)(random*3)+1;

        switch (cpu){
            case 1:
                System.out.println("가위");
                break;
            case 2 :
                System.out.println("바위");
                break;
            default:
                System.out.println("보");
            }
        System.out.println("==========================================");
        if(cpu==1) {
            System.out.println("컴퓨터 :가위");
        }else if(cpu==2){
            System.out.println("컴퓨터 : 바위");
        }else System.out.println("컴퓨터 :보");

        if(user==1){
            System.out.println("사용자 : 가위");
            }else if(user==2){
            System.out.println("사용자 : 바위");
        }else{
            System.out.println("사용자 : 보");
        }
        System.out.println("==========================================");
        if (cpu ==1) {
            System.out.println("비겼습니다");
        }else if(cpu==2) {
            System.out.println("졌습니다");
        }else System.out.println("이겼습니다");

// 입력 글자를 문자열로하면 랜덤과 부딛힘
        // 그렇지 않으면 가위바위보 가아니고 숫자놀아가 됨
        //랜덤을 문자열로 고치거나 숫자에다 문자 값을 넣주거나






//        if(cpu==user) {
//            System.out.println("비겼습니다");
//        }else if(user>cpu) {
//            System.out.println("이겼습니다");
//        }else System.out.println("졌습니다");;
//        System.out.println("컴퓨터 :"+cpu);
//        System.out.println("사용자 :"+user);
    }
}
