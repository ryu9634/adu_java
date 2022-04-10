public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        while(i < 10){
            System.out.println("현재 i의 값 : " + i);
            i++;
        }

        do {
            System.out.println("현재 i의 값 : " + i);
            i++;
        }while(i < 10);
    }
}
