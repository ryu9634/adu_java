import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        int port = 9999;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("클라이언트를 기다리고 있습니다");
            while (true){
                // 새로운 클라이언트가 접속했을 때 클라이언트 소켓을 생성
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트가 접속 했습니다");
                System.out.println("Client ip:" + socket.getInetAddress());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
