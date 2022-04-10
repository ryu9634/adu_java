import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        try {
            File file1 = new File("D:\\Ryuzy\\Java\\Day10\\input1.txt");
            System.out.println(file1.exists());
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
            System.out.println(file1.length());

            File dir = new File("D:\\Ryuzy\\Java\\Day10\\new\\subDir");
            dir.mkdir();

            File file2 = new File(dir, "input2.txt");
            file2.createNewFile();

            File file3 = new File("input3.txt");
            file2.renameTo(file3);

            System.out.println(file3.getPath());            // 상대 경로
            System.out.println(file3.getAbsolutePath());    // 절대 경로
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
