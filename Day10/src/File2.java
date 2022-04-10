import java.io.FileInputStream;

public class File2 {
    public static void main(String[] args) {
        byte[] arr1 = new byte[20];
        byte[] arr2 = new byte[20];

        try{
            FileInputStream fis = new FileInputStream("input4.txt");
            System.out.println((char) fis.read()); // H
            fis.read(arr1, 0, 5);
            for(byte b : arr1){
                System.out.print((char)b + " ");
            }

            fis.read(arr2);
            System.out.println();
            for(byte b : arr2){
                System.out.print((char)b + " ");
            }
            fis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
