import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String file = "product.txt";
        Scanner sc;
        String temp;
        String[] product;
        Product p;
        ArrayList<Product> list = new ArrayList<>();

        try{
            sc = new Scanner(new FileInputStream(file));
            while(sc.hasNextLine()){
                temp = sc.nextLine();   // 노트20,1200000,삼성
                product = temp.split(",");
                /*
                    product[0] = "노트20";
                    product[1] = "1200000";
                    product[2] = "삼성";
                 */
                p = new Product(product[0], Integer.parseInt(product[1]), product[2]);
                list.add(p);
            }
            for(Product pro : list){
                System.out.println(pro);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
