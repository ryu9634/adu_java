import java.io.FileInputStream;
import java.util.Scanner;

public class File6 {
    public static void main(String[] args) {
        String file1 = "output3.txt";
        Scanner sc;

        try{

//            FileInputStream fis = new FileInputStream(file1);
//            sc = new Scanner(fis);
            sc = new Scanner(new FileInputStream(file1));

            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
