import java.io.BufferedReader;
import java.io.FileReader;

public class Home_Work {
    public static void main(String[] args) {

        String str = "data.txt";
        try {

            BufferedReader lee = new BufferedReader(new FileReader(str));

            String[][] person = new String[4][4];

            for (int i = 0; i < person.length; i++) {
                person[i] = lee.readLine().split(",");
            }

            System.out.println("------------성적프로그램---------------");

            for (int i = 0; i < person.length; i++) {

                int j = 0;
                System.out.println("이름 : " + person[i] [j]);
                j ++;
                System.out.println("영어 : " + person[i] [j]);
                j++;
                System.out.println("국어 : "+ person[i] [j]);
                j++;

                System.out.println("수학 : " + person[i] [j]);
                int total = Integer.parseInt(person[i][j-2]) + Integer.parseInt(person[i][j-1]) + Integer.parseInt(person[i][j]);
                double avg = (double)total / 3;
                System.out.println("총점 : " + total);
                System.out.println("평균 : " + avg);
                if (avg >= 90 && avg <= 100) {
                    System.out.println("성적 : A");
                } else if (avg >= 80) {
                    System.out.println("성적 : B");
                } else if (avg >= 70) {
                    System.out.println("성적 : C");
                } else if (avg >= 60) {
                    System.out.println("성적 : D");
                } else
                    System.out.println("성적 : F");


                System.out.println("********************");


            }




            lee.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
