import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= 7,tot=0;// tot는 마지막에  맞히갯수 확인 할떄
        int[] me = new int[num];                //사용자 입력 번호
        int[] lotto=new int[7];                 //lotto 번호
        for (int i = 1; i < me.length; i++) {       //반복문을 통해서 나의 배열에다가 입력값을 하나 하나 입력을 해준다
            me[i]= sc.nextInt();
            System.out.print(i+"번째 숫자");
        }  System.out.println("-----------------------------");
        System.out.println("정답을 확인하시겠습니까?");
        int ent = sc.nextInt();
       int index=0;
        while(index!=7) {
            lotto[index] =(int)(Math.random()*45)+1;    //랜덤으로 lotto의 배열값을 넣준다
            for(int i =0; i<index; i++){                //
                if(lotto[i]==lotto[index]){
                    index--;                            //중복과정 제거   index--; 가 핵심부분
                    break;
                }
            }
index++;
        }
        System.out.println("추첨번호 6개");          //
        for(int i =1; i <lotto.length;i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println("\n맞힌 로또번호");
        for(int i =0; i <lotto.length;i++){
            for(int j =0;j<me.length;j++){
                if(lotto[i]==me[j]){
                    tot++;
                    System.out.println(me[j]+"");
                    break;

                }
            }
        }
        System.out.println("맞힌 로또 갯수 : "+ tot);
    }
}


