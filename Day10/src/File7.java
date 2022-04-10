import java.io.FileOutputStream;
import java.io.PrintWriter;

public class File7 {
    public static void main(String[] args) {
        String file1 = "output3.txt";
        String[] arr = {"김사과", "오렌지", "반하나", "이메론"};

        try{
//            FileOutputStream fos = new FileOutputStream(file1);
//            PrintWriter pw = new PrintWriter(fos);
            PrintWriter pw = new PrintWriter(new FileOutputStream(file1));
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
                pw.println(arr[i]);
            }
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
