import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        JavaQuSt Qu = new JavaQuSt();
        JavaQuSt St = new JavaQuSt();

        System.out.println("(St)선입 선출할 숫자를 입력하세요");
                for (int i = 0; i < 9; i++) {
                    St.push(sc.nextInt());
                }
        St.search();
        System.out.println();
        System.out.print(St.peekSt());
        System.out.println();
        System.out.print(St.pop());
        St.search();

        System.out.println();

        System.out.println("(Qu)선입 선출할 숫자를 입력하세요 ");
                for (int i = 0; i < 9; i++) {
                    Qu.offer(sc.nextInt());
                }
                Qu.search();
        System.out.print(Qu.peekQu());
        System.out.print(Qu.poll());
        Qu.search();
            }
        }
