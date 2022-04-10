public class homeWork3 {
    public static void main(String[] args) {
        int random;
        String lottoNum = "";

        for (int i = 0; i < 6; i++) {
            random = (int) (Math.random() * 45) + 1;
            lottoNum += random + " ";
        }
        lottoNum += "보너스 번호 : " + (int) (Math.random() * 45 + 1);
        System.out.println(lottoNum);

    }
}
