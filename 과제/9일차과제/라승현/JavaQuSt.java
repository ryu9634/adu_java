
/*

π κ³Όμ  1 : μλ° λ°°μ΄μ μ΄μ©νμ¬ Queue κΈ°λ₯ κ΅¬ν
            * Queue FIFO(First Input First Out)

    class SuperStack{
        λ°°μ΄

        public void push(int num){
            λ°°μ΄ λμ λ°μ΄ν°λ₯Ό μ μ₯
        }

        public int peek(){
            return λ°°μ΄ λ λ°μ΄ν°;
        }

        public int pop(){
            λ°°μ΄ λ λ°μ΄ν°λ₯Ό μ­μ 
            return λ°°μ΄ λ λ°μ΄ν°;
        }
    }


*/

import java.util.Arrays;

public class JavaQuSt {
    private int cnt = 1;
    private int temp = 0;
    private int[] str1 = new int[10];
    private int[] str2 = new int[10];


/*
        Stack
        β push() : μμ μΆκ°
        β peek() : λ§μ§λ§(μ²«λ²μ§Έλ‘ μΆλ ₯λ ) λ°μ΄ν° λ°ν
        β pop() : λ§μ§λ§(μ²«λ²μ§Έλ‘ μΆλ ₯λ ) λ°μ΄ν° λ°ν ν μ­μ 
        β search() : κ²μνκ³ μ νλ λ°μ΄ν°κ° μΆλ ₯λ  μμ νμΈ
        β clear() : λ°μ΄ν° μ­μ 
*/
    public void push(int num){
        str1[cnt-1] = num;
        cnt++;
    }

    public int peekSt(){
        temp = str1[cnt-1];
        return temp;
    }

    public int pop(){
     temp = str1[cnt-1];
        cnt--;
        return temp;
    }

    public void search(){
        for (int i = 0; i < cnt-1; i++) {
            System.out.println(str1[i] + " ");
        }
    }
    /*
        Queue
        β offer() : μμ μΆκ°
        β peek() : μ²«λ²μ§Έ λ°μ΄ν° λ°ν
        β poll() : μ²«λ²μ§Έ λ°μ΄ν° λ°ν ν μ κ±° = remove()μ λμΌ
        β clear : queue κ° μ­μ 
     */

    public void offer(int num){
        str2[cnt-1] = num;
        cnt++;
    }

    public int peekQu(){
        temp = str2[cnt-1];
        return temp;
    }

    public int poll(){
        temp = str2[cnt-1];
        --cnt;
        return temp;
    }

}
