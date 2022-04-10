import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위:[1], 바위:[2], 보:[3]을 입력하세요");
        int use = sc.nextInt();

        switch (use){
            case 1 :
                System.out.println("유저: 가위");
                break;
            case 2:
                System.out.println("유저: 바위");
                break;
            case 3:
                System.out.println("유저: 보");
                break;
        }
        double random = Math.random();
        int cpu = (int)(random*3)+1;
        switch (cpu){
            case 1 :
                System.out.println("컴퓨터: 가위");
                break;
            case 2:
                System.out.println("컴퓨터: 바위");
                break;
            case 3:
                System.out.println("컴퓨터: 보");
                break;
        }



       if(use==cpu) {
           System.out.println("비겼습니다");

       }else if(use==1 && cpu==2){
           System.out.println("내가 이겼습니다");}
       else if(use==1 && cpu==3){
           System.out.println("컴퓨터가 이겼습니다");}

       else if(use==2 && cpu==1){
           System.out.println("컴퓨터가 이겼습니다");}
       else if(use==2 && cpu==3){
           System.out.println("내가 이겼습니다");}
       else if(use==3 && cpu==1){
           System.out.println("컴퓨터가 이겼습니다");}
       else if(use==3 && cpu==2){
           System.out.println("내가 이겼습니다");}
       else{
           System.out.println("1,2,3번 중에 골라주세요");
       }
    }
}
