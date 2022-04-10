public class While2 {
    public static void main(String[] args) {
        // 1+2+3+4+5+6+7+8+9+10
        int i = 1;
        int sum = 0;    // 1, 3, 6, 10, 15, 21, 28, 36, 45, 55

        /*
            0 + 1 = 1
            1 + 2 = 3
            3 + 3 = 6
            6 + 4 = 10
            10 + 5 = 15
            15 + 6 = 21
            21 + 7 = 28
            28 + 8 = 36
            36 + 9 = 45
            45 + 10 = 55
         */
        while(i <= 10){
            sum += i;   // sum = sum + i;
            i++;
        }
        System.out.println("1 ~ 10까지 총합 : " + sum);
        System.out.println("i : " + i);
    }
}
