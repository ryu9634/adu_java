import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("빅맥", 5500, "맥도날드"));
        list.add(new Product("PSvita", 250000, "SONY"));
        list.add(new Product("오딧세이", 1700000, "삼성"));
        list.add(new Product("스타일러", 1200000, "LG"));
        list.add(new Product("안마의자", 1000000, "바디프렌드"));

        for(Product p : list){
            System.out.println(p);
        }

        String file = "print.txt";
        try{
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
            for(Product p : list){
                printWriter.println(p);
            }
            printWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
