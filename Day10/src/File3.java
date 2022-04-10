import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File3 {
    public static void main(String[] args) {
        String input = "D:\\Ryuzy\\Java\\Day10\\input4.txt";
        String output = "D:\\Ryuzy\\Java\\Day10\\output1.txt";

        FileInputStream fis;
        FileOutputStream fos;

        try{
            fis = new FileInputStream(input);
            fos = new FileOutputStream(output);

            int b;
            while((b = fis.read()) != -1){
                fos.write(b);
                System.out.print((char) b + " ");
            }
            fis.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
