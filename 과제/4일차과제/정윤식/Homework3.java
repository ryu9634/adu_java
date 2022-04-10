import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        Random rand=new Random();
        for(int i=0; i<6; i++){


            System.out.println("로또예상번호:"+ " " +rand.nextInt(46));

        }
    }
}
