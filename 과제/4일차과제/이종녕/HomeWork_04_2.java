import java.util.Scanner;

public class HomeWork_04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i =0;
        while(true){

            if(i >= 10){
                System.out.println("수고하셨습니다 프로그램이 종료됩니다.");
                break;
            }

            double rd = Math.random();
            int cpu1 = (int)(rd*10)+1;

            double rd2 = Math.random();
            int cpu2 = (int)(rd2*10)+1;

            double rd3 =Math.random();
            int oper =(int)(rd3*4)+1;

//-------------------------------------------------

            System.out.print(cpu1);
            if(oper == 4){
                System.out.print(" + ");
            }else if(oper ==1){
                System.out.print(" * ");
            }else if (oper ==2){
                System.out.print(" - ");
            }else if(oper ==3){
                System.out.print(" / " );
            }
            System.out.println( cpu2 + " = ?");
            System.out.println("(나누기는 나머지를 뺴고 입력해주세요)");
           //
            int core = sc.nextInt();

            if(oper ==1){//곱하기는 1번
                oper = (cpu2*cpu1);
            }else if(oper ==2 ){//빼기는 2번
                oper = (cpu1-cpu2);

            }else if(oper ==3 ){//나누기는 3번
                oper = (cpu1/cpu2);
            }else if(oper == 4){//더하기는 4번
                oper = (cpu1+cpu2);
            }



            if(core  == oper) {
                System.out.println("정답입니다.");
                i++;
                System.out.println("1 점 획득");
                System.out.println("현재 점수 : "+i);

            }
            else if(core != oper) {
                System.out.println("틀렸습니다.");
                i--;
                System.out.println("-1점 차감입니다.");
                System.out.println("현재 점수 : " + i);
            }else{
                System.out.println("제대로 된 숫자를 입력해주세요!");


            }






        }

    }
}
