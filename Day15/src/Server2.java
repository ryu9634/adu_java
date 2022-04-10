import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("서버 소켓 생성됨");

            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 접속 했습니다");
            System.out.println("Client ip:" + socket.getInetAddress());

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            while(true){
                String data = br.readLine();
                if(data.equals("Q") || data.equals("q")){
                    System.out.println("프로그램 종료");
                    break;
                }
                System.out.println("client 메세지 : " + data);
            }
            br.close();
            pw.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
