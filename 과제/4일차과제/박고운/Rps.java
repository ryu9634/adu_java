
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
    double random = Math.random();
    while(true){
        System.out.println("가위 바위 보 중 입력. (1: 가위. 2: 바위. 3: 보.");
        Scanner sc = new Scanner(System.in);
        int uer = sc.nextInt();
        System.out.println("컴퓨터 : ");
        int com = (int)(random * 3) + 1;
        switch (com){
            case 1 :
                System.out.println("가위");break;
            case 2 :
                System.out.println("바위");break;
            case 3 :
                System.out.println("보");break;
        }
    }
        System.out.println("유저 : ");
        switch (user){
            case 1:
                System.out.println("가위");break;
            case 2 :
                System.out.println("바위");break;
            case 3 :
                System.out.println("보");break;}

        if (user == com){
            System.out.println("컴퓨터와 비겼습니다");}
        elsd if ( (user == 1 && com == 3)||(user == 2 && com ==1)||(user ==3 && com ==2)){
            System.out.println("유저가 이겼습니다."); break;
        }
        else System.out.println("컴퓨터가 이겼습니다.");
        }}


