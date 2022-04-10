public class Oop {
    public static void main(String[] args) {

        Health[] healths = new Health[2];
        healths[0] = new AnAerobic(1, "무산소", 10, 5, 10);
        healths[1] = new Aerobic(2, "유산소", 20, 2, 3);

        // System.out.println(healths[0]);
        // System.out.println(healths[1]);
        Button anareobic1 = new Button();
        anareobic1.click();


    }


}
