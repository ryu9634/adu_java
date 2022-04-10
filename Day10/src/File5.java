import java.io.FileWriter;

public class File5 {
    public static void main(String[] args) {
        String str = "Hello Java!";

        try{
            FileWriter fw = new FileWriter("output2.txt");
            fw.write(str.charAt(0));
            fw.write("\t"); // 탭
            fw.write(str);
            fw.write("\n"); // 개행
            fw.write("안녕하세요!");
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
