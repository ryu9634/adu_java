import java.io.IOException;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 9999);
            System.out.println("서버와 접속이 되었습니다");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
